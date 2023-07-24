package bus_rev;
import java.sql.*;
import java.sql.SQLException;

public class DBconnection {
	private static String url="jdbc:mysql://localhost:3306/busreserv";
	private static String username="root";
	private static String password="2310";
	
	public static Connection getcon() throws SQLException{
		
		return DriverManager.getConnection(url, username,password);
	}

}
