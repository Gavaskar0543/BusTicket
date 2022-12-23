package BusReservation;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//bus data
		ArrayList<Bus>buses = new ArrayList<>();
		buses.add(new Bus(01,true,1));
		buses.add(new Bus(02,true,35));
		//to store booking 
		ArrayList<Passenger>newPassenger = new ArrayList<>();
		//to acces bus data
		for(Bus b :buses) {
		b.displayBusInfo();
		}
		//user option
		int userOption = 1;
		while(userOption ==1) {
			System.out.println("Enter 1 to book , 2 to exit");
			userOption = s.nextInt();
			if(userOption == 1) {
			Passenger passengerList = new Passenger();
			if(passengerList.isAvailable(newPassenger,buses)) {
				newPassenger.add(passengerList);
				System.out.println("Booking sucessful");				
			}
			else {
				System.out.println("no seat avaialable change date or bus");
			}
			}
		}
	}

}
