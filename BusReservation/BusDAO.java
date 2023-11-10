package BusReservation;

import java.sql.*;

public class BusDAO {
public void displayBusInfo() throws SQLException {
Connection con =	Dbconnection.getConnection();
String query = "select * from Bus";
Statement st = con.createStatement();
 ResultSet rs =  st.executeQuery(query);
 
 while(rs.next()) {
	 System.out.println("Bus No:"+" "+ rs.getInt(1));
	 
	 if(rs.getInt(2) == 0) {
		 System.out.println("Ac:"+" "+ "No");
	 }
	 else {
		 System.out.println("AC:"+" "+" Yes");
	 }
	 
	 System.out.println("Capacity:"+" "+ rs.getInt(3));
	 System.out.println("--------------------------------------------------");
 }
}
}
