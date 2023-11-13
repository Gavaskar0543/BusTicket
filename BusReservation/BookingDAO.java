package BusReservation;
import java.sql.*;
import java.util.Date;

public class BookingDAO {

	public int getBookedCount(int busNo, Date date) throws SQLException {
		Connection con =	Dbconnection.getConnection();
		String query = "select COUNT(passenger_name) from booking where busNo=? and travel_date= ?";
		
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, busNo);
		pst.setDate(2,sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);

	}

	public void addBooking(Passenger passengerList) throws SQLException {
		Connection con =	Dbconnection.getConnection();
		String query = "insert  into booking values(?,?,?)";
		 PreparedStatement pst = con.prepareStatement(query);
		 java.sql.Date sqlDate = new java.sql.Date(passengerList.date.getTime());
		 pst.setString(1,passengerList.name);
		 pst.setInt(2, passengerList.busNo);
		 pst.setDate(3, sqlDate);
		 pst.executeUpdate();

	}

}
