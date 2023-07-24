package bus_rev;
import java.util.Date;
import java.sql.*;


public class BookingDA {

	public int getBookedCount(int Busno,Date date) throws SQLException {
		String query="select count(Passenger_name) from booking where Bus_no=? and Date=?";
		Connection con =DBconnection.getcon();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, Busno);
		java.sql.Date sqldate= new java.sql.Date(date.getTime());
		pst.setDate(2, sqldate);
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
		
	}
	public void addBooking(Booking booking) throws SQLException {
		String query="insert into booking values(?,?,?)";
		Connection con =DBconnection.getcon();
		PreparedStatement pst=con.prepareStatement(query);
		java.sql.Date sqldate= new java.sql.Date(booking.Date.getTime());
		pst.setString(1, booking.PassengerName);
		pst.setInt(2, booking.Busno);
		pst.setDate(3, sqldate);
		
		pst.executeUpdate();
	}
	

}
