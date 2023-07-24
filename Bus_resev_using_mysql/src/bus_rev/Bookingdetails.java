package bus_rev;
import java.util.Scanner;
import java.sql.SQLException;


public class Bookingdetails {
	public static void main(String[] args) throws SQLException {
		Scanner obj=new Scanner(System.in);
		bus_info bs=new bus_info();
		bs.displaybus();
		int User=1;
		while(User==1) {
			System.out.print("Enter 1 to book and 2 to Exit : ");
			User=obj.nextInt();
		if(User==1) {
	
			Booking Book=new Booking();
			if(Book.isAvailable()) {
				BookingDA ba=new BookingDA();
				ba.addBooking(Book);
				System.out.println("Your booking is confirmed");
				
			}
			else {
				System.out.println("Bus is full.Try another bus or Date");
			}

	}

}
}}