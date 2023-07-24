package bus_rev;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class Booking {
	    String PassengerName;
		static int Busno;
		static Date Date;
Booking(){
		Scanner obj=new Scanner (System.in)	;
		System.out.println("Enter the passenger name:");
		PassengerName=obj.next();
		System.out.println("Enter the BusNo:");
		Busno=obj.nextInt();
		System.out.println("Enter the Date(DD-MM-YYYY)");
		String datein=obj.next();
		SimpleDateFormat dat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date= dat.parse(datein);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		

}

public static boolean isAvailable() throws SQLException {
	bus_info bi=new bus_info();
	BookingDA book=new BookingDA();
	int Capacity=bi.getCapacity(Busno);
	
	int booked=book.getBookedCount(Busno,Date);
	
	return booked<Capacity;
}
}