package product;
import java.sql.*;

import person_infos.DBconnection;

public class DBmaintain {
	public static void ShowTable() {
		try {
			//select all query
		String query="select * from productinfo";
		Connection con=DBconnection.getconnect();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.format("%s\t%s\t%15s\t\n","Id","Product","Price");
		System.out.println("----------------------------------------------------");
		while(rs.next()) {
			System.out.format("%d\t%s\t%6s\n",
					rs.getInt(1),rs.getString(2),rs.getString(3));
			System.out.println("----------------------------------------------------");
			
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	
	public static void NewEmp(Product_info pi) {
		
		try {
			//new product
		String query="insert into productinfo(id,ProductName,Price) values(?,?,?)";
		Connection con=DBconnection.getconnect();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1,pi.getid() );
		pst.setString(2,pi.getProductName());
		pst.setLong(3, pi.getPrice());
		pst.executeUpdate();

		
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	}
	public static void UpdatePrice(Product_info pi) {
		
		try {
			//update product price
		String query="update productinfo set price=? where id=?";
		Connection con=DBconnection.getconnect();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setLong(1, pi.getPrice());
		pst.setInt(2, pi.getid());
		pst.executeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void DeletePro(int id) {
		try {
			//delete product
			String query="delete from productinfo where id="+id;
			Connection con=DBconnection.getconnect();
			PreparedStatement pst=con.prepareStatement(query);
			pst.executeUpdate();
					
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	

	}
