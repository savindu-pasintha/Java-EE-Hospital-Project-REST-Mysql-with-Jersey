package com.savindu.databasePkg;

import java.sql.SQLException;

public class JobRegistration extends Database {

	public JobRegistration() throws SQLException {
		super();
	}

	public boolean add() throws SQLException {
		
		String query = "INSERT INTO `doctor_job_registration` (`id`,`first`, `last`, `call`, `email`, `city`,"
				+ " `collage`, `digree`, `medical_cetificate_id`, `specialize`,`timestamp`) "
				+ "      VALUES (?,?,?, ?,?,?, ?,?,?, ?,?)";
		// id - autoincremnet , timestamp - autoset
		super.add(query);
		super.pStatment.setInt(1, 0);
		super.pStatment.setString(2, "savindu");
		super.pStatment.setString(3, "pasintha");
		super.pStatment.setString(4, "0768755787");
		super.pStatment.setString(5, "savindu@gmail.com");
		super.pStatment.setString(6, "aluthgama");
		super.pStatment.setString(7, "ICBT Campus");
		super.pStatment.setString(8, "MSC PHARMALOGY ");
		super.pStatment.setString(9, "14542M");
		super.pStatment.setString(10, "SUERGERY");
		super.pStatment.setString(11, null);
		
		return super.executeQuery();
	}

}
