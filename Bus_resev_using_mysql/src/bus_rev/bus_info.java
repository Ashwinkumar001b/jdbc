package bus_rev;
import java.sql.*;

public class bus_info {
	public void displaybus() throws SQLException {
	String query="select * from bus";
	Connection con=DBconnection.getcon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	
	while(rs.next()) {
		System.out.println("Busno : "+rs.getInt(1));
		if(rs.getInt(2)==1) {
			System.out.println("Ac : Yes");
		}
		else
			System.out.println("Ac : No");
		System.out.println("Capacity : "+rs.getInt(3));
		System.out.println("----------------");
	}
	System.out.println("_________________________________________________");
	}
	public int getCapacity(int Busno) throws SQLException {
		String query="select capacity from bus where Busno="+Busno;
		Connection con=DBconnection.getcon();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}
}
