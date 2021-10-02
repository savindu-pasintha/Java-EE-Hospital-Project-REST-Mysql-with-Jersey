package com.savindu.HospitalRestServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Databaseabc {

	private static final String urldb = "jdbc:mysql://localhost:3306/hospital";
	private static final String usernamedb = "root";
	private static final String passworddb = "";

	public Connection conn = null;
	public PreparedStatement pStatment;
	public ResultSet resultSet = null;

	public Databaseabc() throws SQLException {
		conn = (Connection) DriverManager.getConnection(urldb, usernamedb, passworddb);
	}

	public ResultSet read(String selectQuery) throws SQLException {
		pStatment = (PreparedStatement) conn.prepareStatement(selectQuery);
		resultSet = pStatment.executeQuery();
		return resultSet;
	}

	public ResultSet search(String selectQuery) throws SQLException {
		pStatment = (PreparedStatement) conn.prepareStatement(selectQuery);
		resultSet = pStatment.executeQuery();
		return resultSet;
	}

	public boolean add(String insertQuery) throws SQLException {
		boolean x = false;
		pStatment = (PreparedStatement) conn.prepareStatement(insertQuery);
		x = true;
		return x;
	}

	public boolean update(String updateQuery) throws SQLException {
		boolean x = false;
		pStatment = (PreparedStatement) conn.prepareStatement(updateQuery);
		x = true;
		return x;
	}

	public boolean delete(String deleteQuery) throws SQLException {
		boolean x = false;
		pStatment = (PreparedStatement) conn.prepareStatement(deleteQuery);
		x = true;
		return x;
	}

	public boolean executeQuery() throws SQLException {
		boolean x = false;
		if (pStatment.executeUpdate() == 1) {
			x = true;

		} else {
			x = false;
		}
		conn.close();
		return x;
	}

}
