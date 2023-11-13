package BusReservation;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Passenger {
    String name;
    Date date;
    int busNo;

    public Passenger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passenger name:");
        name = scanner.nextLine();

        System.out.println("Enter busNo from above:");
        busNo = scanner.nextInt();
        System.out.println("Enter date in format: dd-MM-yyyy");
        String dateInput = scanner.next();
        
        // date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            // Parse the date and assign it to the 'date' field
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            // Handle the ParseException according to your requirements
            e.printStackTrace();
        }
    }

    public boolean isAvailable() throws SQLException {
        BusDAO busdao = new BusDAO();
        int capacity = busdao.getCapacity(busNo);
        BookingDAO bookingDao = new BookingDAO();
        int booked = bookingDao.getBookedCount(busNo, date);
        return booked < capacity;
    }
}
