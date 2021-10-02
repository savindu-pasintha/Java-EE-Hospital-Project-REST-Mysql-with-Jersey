package com.savindu.databasePkg;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicalPackages  extends Database{

	public MedicalPackages() throws SQLException {
		super();
	}
    
	public void read() throws SQLException {
		ResultSet resultSe = super.read("SELECT * FROM `packages`");
		if (resultSet != null) {
			while (resultSe.next()) {
				System.out.println(resultSe.getInt("id"));
				/*
				 * resultSe.getInt("id") resultSe.getString("doctor")
				 * resultSe.getString("specialization") resultSe.getString("hospital")
				 * resultSe.getString("date-time") resultSe.getString("timestamp")
				 * resultSe.getString("user_id") 
				 */
			}
			super.conn.close();
		}
	}

	public boolean add(String name,String categoryName,String serviceName,String description,String location,String serviceTime,String call, String price)
			throws SQLException {
		String query = "INSERT INTO `packages` (`id`, `name`, `category_name`, `service_name`, `description`, `location`, `service_time`, `call`, `price`) VALUES (?,?,?,?,?,?,?,?,?)";
		super.add(query);
		super.pStatment.setInt(1,0);
		super.pStatment.setString(2, name);
		super.pStatment.setString(3, categoryName);
		super.pStatment.setString(4, serviceName);
		super.pStatment.setString(5, description);
		super.pStatment.setString(6, location);
		super.pStatment.setString(7,serviceTime);
		super.pStatment.setString(8,call);
		super.pStatment.setString(9,price);
		return super.executeQuery();
		//id=int autoincrement 
	}

	public boolean update(String name,String categoryName,String serviceName,String description,String location,String serviceTime,String call, String price,int id)
			throws SQLException {
		super.update(
				"UPDATE `packages` SET  `id`=?, `name`=?, `category_name`=?, `service_name`=?, `description`=?, `location`=?, `service_time`=?, `call`=?, `price`=?  WHERE `id`=?");
		super.pStatment.setInt(1,id);
		super.pStatment.setString(2,name);
		super.pStatment.setString(3,categoryName);
		super.pStatment.setString(4,serviceName);
		super.pStatment.setString(5,description);
		super.pStatment.setString(6,location);
		super.pStatment.setString(7,serviceTime);
		super.pStatment.setString(8,call);
		super.pStatment.setString(9,price);
		super.pStatment.setInt(10,id);
		return super.executeQuery();
		 //id=int autoincrement timestamp=autoset
	}

	public boolean deletec(String id) throws SQLException {
		String query = "DELETE FROM `packages` WHERE id=?";
		super.pStatment.setString(1, id);
		super.delete(query);
		return super.executeQuery();
	}

}
