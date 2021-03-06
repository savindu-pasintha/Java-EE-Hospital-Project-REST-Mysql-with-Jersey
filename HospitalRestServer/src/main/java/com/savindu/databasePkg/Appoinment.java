package com.savindu.databasePkg;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Appoinment extends Database {

	public Appoinment() throws SQLException {
		super();
	}

	public void read() throws SQLException {
		ResultSet resultSe = super.read("SELECT * FROM appoinment");
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

	public boolean add(String doctorId, String spc, String hospital, String datetime, String userId)
			throws SQLException {
		String query = "INSERT INTO `appoinment` (`id`, `doctor`, `specialization`, `hospital`, `date-time`, `timestamp`, `user_id`) VALUES (?,?, ?, ?, ?,?,?)";
		super.add(query);
		super.pStatment.setInt(1,0);//id=autoincrement timestamp=autoset
		super.pStatment.setString(2, doctorId);
		super.pStatment.setString(3, spc);
		super.pStatment.setString(4, hospital);
		super.pStatment.setString(5, spc);
		super.pStatment.setString(6, datetime);
		super.pStatment.setString(7,null);
		super.pStatment.setString(8,userId);
		return super.executeQuery();
	}

	public boolean update(String doctorId, String spc, String hospital, String datetime, String userId,int id)
			throws SQLException {
		super.update(
				"UPDATE `appoinment` SET  `doctor`=?, `specialization`=?,`hospital`=?, `date-time`=?, `user_id`=?  WHERE `id`=?");
		super.pStatment.setString(1, doctorId);
		super.pStatment.setString(2, spc);
		super.pStatment.setString(3, hospital);
		super.pStatment.setString(4, datetime);
		super.pStatment.setString(5,userId);
		super.pStatment.setInt(6, id);
		return super.executeQuery();
		 //id=int autoincrement timestamp=autoset
	}

	public boolean deletec(String id) throws SQLException {
		String query = "DELETE FROM `appoinment` WHERE id=?";
		super.pStatment.setString(1, id);
		super.delete(query);
		return super.executeQuery();
	}

}
