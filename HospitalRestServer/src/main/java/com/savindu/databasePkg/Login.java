package com.savindu.databasePkg;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends Database {
	public String ss ="savindu";

	public Login() throws SQLException {
		super();
	}
	
	public boolean userValid(String username,String password) throws SQLException {
		boolean res = false;
		ResultSet resultSe = super.read("SELECT  `password`  FROM `login` WHERE `username`='"+username+"'");
		if (resultSet != null) {
			while (resultSe.next()) {
				if(resultSe.getString("password") == password) {
					res = true;
				}
			}
		}
		super.conn.close();
		return res;
	}

	public void read() throws SQLException {
		new Database();
		ResultSet resultSe = super.read("SELECT * FROM `login`");
		if (resultSet != null) {
			while (resultSe.next()) {
				System.out.println(resultSe.getInt("id"));
			}
		}
		super.conn.close();
	}

	public boolean add(String username, String password) throws SQLException {
		super.add("INSERT INTO `login` (`id`, `username`, `password`, `timestamp`) VALUES (?,?,?,?)");
		super.pStatment.setInt(1, 0);
		super.pStatment.setString(2, username);
		super.pStatment.setString(3, password);
		super.pStatment.setString(4, null);
		return super.executeQuery();
		// id:autoincrement int
	}

	public boolean update(String username, String password, int id) throws SQLException {
		super.update("UPDATE `login` SET `username`=?, `password`=?, WHERE id=?");
		super.pStatment.setString(1, username);
		super.pStatment.setString(2, password);
		super.pStatment.setInt(3, id);
		return super.executeQuery();
	}

	public boolean deletec(String username) throws SQLException {
		String query = "DELETE FROM `login` WHERE `username`=?";
		super.pStatment.setString(1,username);
		super.delete(query);
		return super.executeQuery();
	}
	
	

}