package Java2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqlconnection_withjava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//mention the type of db to be used
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create connection with the db
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/employees");
		//statement
	    Statement statement = connection.createStatement();
	    //execute query and store it in resultset
	    ResultSet result = statement.executeQuery("SELECT * From users");
	    while(result.next()) {
	    	System.out.println("id:" +result.getString(1));
	    	System.out.println("name:" +result.getString(2));
	    	System.out.println("job:" +result.getString(3));
	    }
	}
}
