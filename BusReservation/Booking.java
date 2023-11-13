package BusReservation;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking {

	public static void main(String[] args) throws SQLException {
		BusDAO  busdao = new BusDAO();
		busdao.displayBusInfo();
	Scanner s = new Scanner(System.in);
//		
		
		
		//user option
	int userOption = 1;
	while(userOption ==1)
	{
			System.out.println("Enter 1 to book , 2 to exit");
		userOption = s.nextInt();
		if(userOption == 1) {
		Passenger passengerList = new Passenger();
		if(passengerList.isAvailable()) {
			BookingDAO  bookingdao = new BookingDAO();
			bookingdao.addBooking(passengerList);
			System.out.println("Booking sucessful");				
		}
		else {		
			System.out.println("no seat avaialable change date or bus");
		}
		}
		}
	}

}
