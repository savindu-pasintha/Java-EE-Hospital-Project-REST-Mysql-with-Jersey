package com.savindu.databasePkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Database {

	private static final String urldb = "jdbc:mysql://localhost:3306/hospital";
	private static final String usernamedb = "root";
	private static final String passworddb = "";

	public Connection conn = null;
	public PreparedStatement pStatment;
	public ResultSet resultSet = null;

	public Database() throws SQLException {
		try {
			conn = (Connection) DriverManager.getConnection(urldb, usernamedb, passworddb);
		} catch (SQLException ex) {
			Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public ResultSet read(String selectQuery) {
		try {
			pStatment = (PreparedStatement) conn.prepareStatement(selectQuery);
			resultSet = pStatment.executeQuery();
		} catch (SQLException ex) {
			Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
			resultSet = null;
		}
		return resultSet;
	}

	public ResultSet search(String selectQuery) {
		try {
			pStatment = (PreparedStatement) conn.prepareStatement(selectQuery);
			resultSet = pStatment.executeQuery();
		} catch (SQLException ex) {
			Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
			resultSet = null;
		}
		return resultSet;
	}

	public boolean add(String insertQuery) {
		boolean x = false;
		try {
			pStatment = (PreparedStatement) conn.prepareStatement(insertQuery);
			x = true;
		} catch (SQLException ex) {
			Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
			x = false;
		}
		return x;
	}

	public boolean update(String updateQuery) {
		boolean x = false;
		try {
			pStatment = (PreparedStatement) conn.prepareStatement(updateQuery);
			x = true;
		} catch (SQLException ex) {
			Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
			x = false;
		}
		return x;
	}

	public boolean delete(String deleteQuery) {
		boolean x = false;
		try {
			pStatment = (PreparedStatement) conn.prepareStatement(deleteQuery);
			x = true;
		} catch (SQLException ex) {
			Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
			x = false;
		}
		return x;
	}

	public boolean executeQuery() throws SQLException {
		boolean x = false;
		try {
			if (pStatment.executeUpdate() == 1) {
				x = true;
				
			} else {
				x = false;
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}

		return x;
	}

}
