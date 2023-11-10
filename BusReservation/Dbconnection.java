package BusReservation;

import java.sql.*;

public class Dbconnection {
private static final	String url = "jdbc:mysql://localhost:3306/BusServer";
	private static final String userName = "root";
private static final	String password = "Gava050220#";

public static Connection	getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName,password);
	}
}
