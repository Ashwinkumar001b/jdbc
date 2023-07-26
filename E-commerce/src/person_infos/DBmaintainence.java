package person_infos;

import java.sql.*;

public class DBmaintainence {
	
	public static void CreateEmpolyee(Person_infos per)
	{
		//insert query
		try {
		String query="Insert into personinfo(Person_name,Gmail,phn_num) values(?,?,?)";
		Connection con=DBconnection.getconnect();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,per.getname());
		pst.setString(2,per.getGmail());
		pst.setString(3,per.getPhone());
		pst.executeUpdate();
		
		}
		catch(Exception ex){
			System.out.println("*Please Enter Valid Input*");
	}
		
	}
	public static void ShowData() {
		try {
			//select all query
		String query="select * from personinfo";
		Connection con=DBconnection.getconnect();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.format("%s\t%s\t%10s\t%15s\n","Id","Name","Gmail","Phn num");
		System.out.println("----------------------------------------------------");
		while(rs.next()) {
			
			System.out.format("%d\t%s\t%20s\t%s\n",
					rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			System.out.println("----------------------------------------------------");
		
		}
		
		}
		catch(Exception ex) {
		ex.printStackTrace();
		}
	}
	public static void DeleteData(int id) {
		try {
			//delete query
	
			String query="delete from personinfo where id="+id;
			Connection con=DBconnection.getconnect();
			Statement st=con.createStatement();
			st.executeUpdate(query);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void AlterData(AlterDeleteRow adr) {
		try {
			//insert query where user deleted
			String query="Insert into personinfo(Id,Person_name,Gmail,phn_num) values(?,?,?,?)";
			Connection con=DBconnection.getconnect();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1,adr.getId());
			pst.setString(2,adr.getNewname());
			pst.setString(3,adr.getNewGmail());
			pst.setString(4,adr.getNewPhone());
			pst.executeUpdate();
		

		}catch(Exception ex) {
			System.out.println("Enter valid input");
		}
	}
	public static void SearchDate(int id){
		try {
			//search by id query
			String query="select * from personinfo where id = "+id;
			Connection con=DBconnection.getconnect();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			System.out.format("%s\t%s\t%10s\t%15s\n","Id","Name","Gmail","Phn num");
			System.out.println("----------------------------------------------------");
			while(rs.next()) {
				System.out.format("%d\t%s\t%20s\t%s\n",
						rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			System.out.println("----------------------------------------------------");
			}
	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	}


