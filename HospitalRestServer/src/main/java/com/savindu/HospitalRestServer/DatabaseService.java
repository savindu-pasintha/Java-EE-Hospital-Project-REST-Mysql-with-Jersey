package com.savindu.HospitalRestServer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver 
import com.savindu.databasePkg.Appoinment;
import com.savindu.databasePkg.Database;
import com.savindu.databasePkg.Login;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

@Path("database")
public class DatabaseService {

	/*
	 * private static final String urldb = "jdbc:mysql://localhost:3306/hospital";
	 * private static final String usernamedb = "root"; private static final String
	 * passworddb = "";
	 * 
	 * public Connection conn = null; public PreparedStatement pStatment; public
	 * ResultSet resultSet = null;
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getIt() {
		return "Database web api working !";
	}

	@POST
	@Path("/message")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMessage(@PathParam("{message}") String msg) {
		String data = "Helloooooooooooo " + msg;
		return Response.status(200).entity(data).build();
	}

	@GET
	@Path("/testBody/{hai}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBody(String request) {
		String data = request;
		System.out.print(data);
		return Response.status(200).entity(data).build();
	}

	@POST
	@Path("/login/{username}/{password}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getLogin(@PathParam("username") String username, @PathParam("password") String password) {
		boolean valid = false;
		/*
		 * if (username != null && password != null) { try { if (new
		 * Login().userValid(username, password)) { valid = true; } } catch
		 * (SQLException e) { e.printStackTrace(); } }
		 */
		// http://localhost:8080/HospitalRestServer/webapi/database/login/savindupasingtha@gmail.com/pass1234
		return Response.status(200).entity(valid).build();
	}

	@POST
	@Path("/registration/{username}/{password}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getRegistration(@PathParam("username") String username, @PathParam("password") String password) {
		ResponseBuilder response = new ResponseBuilder();
		boolean valid = false;
		try {
			if (username != null && password != null) {
				Thread.sleep(5000);

				new Login().read();
				// Login objLogin = new Login();
				// System.out.print(objLogin.ss);
				// boolean x = objLogin.add(username,password);
				// Login obj = new Login();
				// System.out.print(x);

				/*
				 * Database db = new Database(); db.
				 * add("INSERT INTO `login` (`id`, `username`, `password`, `timestamp`) VALUES (?,?,?,?)"
				 * ); db.pStatment.setInt(1, 0); db.pStatment.setString(2, username);
				 * db.pStatment.setString(3, password); db.pStatment.setString(4, null);
				 * System.out.print("jjjjjjjjj"+"db.executeQuery()");
				 */
				/*
				 * String insertQuery =
				 * "INSERT INTO `login` (`id`, `username`, `password`, `timestamp`) VALUES (?,?,?,?)"
				 * ; pStatment = (PreparedStatement) conn.prepareStatement(insertQuery);
				 * pStatment.setInt(1, 0); pStatment.setString(2, username);
				 * pStatment.setString(3, password); pStatment.setString(4, null); if
				 * (pStatment.executeUpdate() == 1) { System.out.print("registered !");
				 * 
				 * } else { System.out.print("Not registered !"); }
				 */
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// http://localhost:8080/HospitalRestServer/webapi/database/registration/savindupasingtha@gmail.com/pass1234
		return Response.status(200).entity(username + "-" + password).build();
	}

	@GET
	@Path("/appoinment/{doctor}/{specialyzation}/{hospitalname}/{datetime}/{userid}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAppoinment(@PathParam("doctor") String doctor, @PathParam("specialyzation") String spc,
			@PathParam("hospitalname") String hospitalName, @PathParam("datetime") String dateTime,
			@PathParam("userid") String userId) {
		boolean valid = false;
		if (doctor != null && spc != null && hospitalName != null && dateTime != null && userId != null) {
			// valid = new
			// Appoinment().add("doctor","spc","hospitalName","dateTime","userId");
			try {
				Database db = new Database();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.print(valid);
		}
		return "lllllllllll " + " doctor+spc+hospitalName+dateTime+userId ";
		// {doctor}/{specialyzation}/{hospitalname}/{datetime}/{userid}
	}

	@GET
	@Path("/doctors")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getDoctors(@PathParam("doctors") String centers) {
		String data = "List of Doctors data set";
		// http://localhost:8080/HospitalRestServer/webapi/database/doctors
		return Response.status(200).entity(data).build();
	}

	@GET
	@Path("/centers")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getCenters(@PathParam("centers") String centers) {
		String data = "List of Centers data set";
		// http://localhost:8080/HospitalRestServer/webapi/database/centers
		return Response.status(200).entity(data).build();
	}

	@GET
	@Path("/medicalpackages")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getPackages(@PathParam("medicalpackages") String packages) {
		String data = "List of Medical Packages data set";
		// http://localhost:8080/HospitalRestServer/webapi/database/medicalpackages
		return Response.status(200).entity(data).build();
	}

	@POST
	@Path("/contact/{name}/{email}/{telephone}/{message}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getContact(@PathParam("name") String name, @PathParam("email") String email,
			@PathParam("telephone") String telephone, @PathParam("message") String message) {
		String data = name + email + telephone + name;
		// http://localhost:8080/HospitalRestServer/webapi/database/contact/{name}/{email}/{telephone}/{message}
		return Response.status(200).entity(data).build();
	}

	@POST
	@Path("/doctorJobRegistration/{first}/{last}/{mobile}/{email}/{city}/{collage}/{digree}/{medicalcetificateid}/{specification}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getDoctorJobRegistration(@PathParam("first") String first, @PathParam("last") String last,
			@PathParam("mobile") String mobile, @PathParam("email") String email, @PathParam("city") String city,
			@PathParam("collage") String collage, @PathParam("digree") String digree,
			@PathParam("medicalcetificateid") String mcid, @PathParam("specification") String spc) {
		String data = first + last + mobile + email + city + collage + digree + mcid + spc;
		// http://localhost:8080/HospitalRestServer/webapi/database/doctorJobRegistration/{first}/{last}/{mobile}/{email}/{city}/{collage}/{digree}/{medicalcetificateid}/{specification}")
		return Response.status(200).entity(data).build();
	}

}
