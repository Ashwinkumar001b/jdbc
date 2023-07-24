package person_infos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	private static String url="jdbc:mysql://localhost:3306/ecommerce";
	private static String username="root";
	private static String Password="2310";
	
	public static Connection getconnect() throws SQLException {
		return DriverManager.getConnection(url, username, Password);
	}

}
