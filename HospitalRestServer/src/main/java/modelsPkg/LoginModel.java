package modelsPkg;

import java.sql.SQLException;

import com.savindu.databasePkg.Login;

public class LoginModel {
	
	private String username, password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void main(String[] args) throws SQLException, InterruptedException {
		System.out.print(new Login().add("ppjjjllpasi@gmail.com","password123"));
		 Thread.sleep(5000);
		new Login().read();
	}

}
