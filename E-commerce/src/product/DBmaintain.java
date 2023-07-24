package product;
import java.sql.*;

import person_infos.DBconnection;

public class DBmaintain {
	public static void ShowTable() {
		try {
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
	public static void ShowCart(int user) {
		Product_info pi=new Product_info();
		try {
			String query ="insert into cartlist(id,ProductName,Price) values(?,?,?)";
			Connection con=DBconnection.getconnect();
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setInt(1, user);
			pst.setString(2,pi.getProductName());
			pst.setLong(3,pi.getPrice() );
			pst.executeUpdate();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void NewEmp(Product_info pi) {
		
		try {
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
			String query="delete from productinfo where id="+id;
			Connection con=DBconnection.getconnect();
			PreparedStatement pst=con.prepareStatement(query);
			pst.executeUpdate();
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public static long GetCal(Product_info pi) {
		try {
			
			String query="select price from productinfo where id="+pi.getid();
			Connection con=DBconnection.getconnect();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
			return rs.getInt(1);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}
	public static void SumProduct(Product_info pi) {
		try {
			DBmaintain db=new DBmaintain();
		String query="insert into sumcart values(?)";
		Connection con=DBconnection.getconnect();
		PreparedStatement pst=con.prepareStatement(query);
		Product_info pie=new Product_info();
		long pri=db.GetCal(pie);
		System.out.println(pri);
		pst.setLong(1,pi.getPrice());
	
		System.out.println("======");
		pst.executeLargeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
