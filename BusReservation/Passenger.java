package BusReservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Passenger {
String name;
Date date;
int age;
int busNo;

public Passenger() {
	Scanner s = new Scanner(System.in);
	System.out.println("enter passanger name:");
	name = s.next();
	System.out.println("enter age:");
	age = s.nextInt();
	System.out.println("enter busNo:");
	busNo = s.nextInt();
	System.out.println("enter date format:dd-mm-yyyy");
	String dateInput = s.next();
	SimpleDateFormat dates = new SimpleDateFormat("dd-MM-yyyy");
	try {
		dates.parse(dateInput);
	} catch (ParseException e) {
	
		e.printStackTrace();
	}
}

public boolean isAvailable(ArrayList<Passenger> newPassenger, ArrayList<Bus> buses) {
	int capacity = 0;
	for(Bus bus : buses) {
		if(bus.getBusNo() == busNo) {
			capacity = bus.getCapacity();	
		}
	}
		int booked = 0;
		for(Passenger p : newPassenger) {
			if(p.busNo == busNo && p.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}

}
