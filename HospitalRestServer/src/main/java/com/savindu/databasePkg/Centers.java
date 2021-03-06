package com.savindu.databasePkg;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Centers extends Database {

	public Centers() throws SQLException {
		super();
	}

	public void read() throws SQLException {
		ResultSet resultSe = super.read("SELECT * FROM centers");
		if (resultSet != null) {
			while (resultSe.next()) {
				System.out.println(resultSe.getString("id"));
				/*
				 * resultSe.getString("id") resultSe.getString("name");
				 * resultSe.getString("location")
				 * 
				 */
			}
		}
		super.conn.close();
	}

	public boolean add(String id, String name, String location) throws SQLException {
		String query = "INSERT INTO `centers` (`id`, `name`, `location`) VALUES (?, ?, ?)";
		super.add(query);
		super.pStatment.setString(1, id);
		super.pStatment.setString(2, name);
		super.pStatment.setString(3, location);
		return super.executeQuery();
	}

	
	public boolean deletec(String id) throws SQLException {
		String query = "DELETE FROM `centers` WHERE id=?";
		super.pStatment.setString(1, id);
		super.delete(query);
		return super.executeQuery();
	}

}
