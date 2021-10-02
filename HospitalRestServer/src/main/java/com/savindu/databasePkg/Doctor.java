package com.savindu.databasePkg;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Doctor extends Database {

	public Doctor() throws SQLException {
		super();
	}

	public void read() throws SQLException {
		ResultSet resultSe = super.read("SELECT * FROM doctors");
		if (resultSet != null) {
			while (resultSe.next()) {
				System.out.println(resultSe.getString("id"));
				/*
				 * resultSe.getString("id") resultSe.getString("name");
				 * resultSe.getString("position") resultSe.getString("hospital")
				 * resultSe.getString("specialization") resultSe.getString("call")
				 */
			}
			super.conn.close();
		}
	}

	public boolean add(String id, String name, String position, String hospital, String spc, String call) throws SQLException {
		String query = "INSERT INTO `doctors` (`id`, `name`, `position`,`hospital`, `specialization`, `call`) VALUES (?,?,?,?,?,?)";
		super.add(query);
		super.pStatment.setString(1, id);
		super.pStatment.setString(2, name);
		super.pStatment.setString(3, position);
		super.pStatment.setString(4, hospital);
		super.pStatment.setString(5, spc);
		super.pStatment.setString(6, call);
		return super.executeQuery();
	}

	public boolean update(String id, String name, String position, String hospital, String spc, String call) throws SQLException {
		super.update("UPDATE doctors SET `id`=?, `name`=?, `position`=?,`hospital`=?, `specialization`=?, `call`=? WHERE `id`=?");
		super.pStatment.setString(1, id);
		super.pStatment.setString(2, name);
		super.pStatment.setString(3, position);
		super.pStatment.setString(4, hospital);
		super.pStatment.setString(5, spc);
		super.pStatment.setString(6, call);
		super.pStatment.setString(7, id);
		return super.executeQuery();
	}

	public boolean deletec(String id) throws SQLException {
		String query = "DELETE FROM `centers` WHERE id=?";
		super.pStatment.setString(1, id);
		super.delete(query);
		return super.executeQuery();
	}

}
