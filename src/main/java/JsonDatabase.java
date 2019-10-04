import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JsonDatabase {

	static void SavingJson(Employee emp) {

		Connection connect = null;
		Statement statement = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Loaded driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/thesis?user=root&password=root");
			System.out.println("Connected to MySQL");

		/*	preparedStatement = connect.prepareStatement("create table `thesis`.`json` (\r\n" + 
					"  `id` INT NOT NULL,\r\n" + 
					"  `name` VARCHAR(45) NULL,\r\n" + 
					"  `permanent` BOOLEAN NULL,\r\n" + 
					"  PRIMARY KEY (`id`)); ");   

			preparedStatement.executeUpdate(); */

			preparedStatement = connect.prepareStatement("insert into  thesis.json values (?, ?, ?, ?, ? ,?)");

			preparedStatement.setInt(1,emp.getId() );
			preparedStatement.setString(2, emp.getName());
			preparedStatement.setObject(3, emp.isPermanent());
			preparedStatement.setObject(4, emp.getAddress().getStreet());
			preparedStatement.setObject(5, emp.getAddress().getCity());
			preparedStatement.setObject(6, emp.getAddress().getZipcode());

			preparedStatement.execute();

			preparedStatement = connect.prepareStatement("SELECT * from thesis.json");
			
			resultSet = preparedStatement.executeQuery();

			writeRow(resultSet);

			connect.close();
			System.out.println("Connection stopped");
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		} 
	}


	static void writeRow(ResultSet resultSet) throws SQLException {
		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			String id = resultSet.getString("id");
			String name = resultSet.getString("name");
			String permanent = resultSet.getString("permanent");

			System.out.println("Id: " + id);
			System.out.println("Name: " + name);
			System.out.println("Permanent: " + permanent);

		}
	}
	
	static void Query() throws ClassNotFoundException, SQLException {
		
		Connection connect = null;
		Statement statement = null;
		ResultSet resultSet = null;
			
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/thesis?user=root&password=root");
		
		statement = connect.createStatement();
		resultSet = statement.executeQuery("SELECT id FROM json WHERE name = 'Gianni'");
		
		while (resultSet.next()) {
			  String id = resultSet.getString("id");
			  System.out.println(id + "\n");
			  
			  
			}
		connect.close();
    }
		
		
	}
