import com.mysql.cj.jdbc.Driver;
import java.sql.*;

class TestApp{
	public static void main(String[] args)throws SQLException{
		//Step1 - Load and register the driver
		Driver driver = new Driver(); //Creating driver object for mySQLDB
		DriverManager.registerDriver(driver);
		System.out.println("Driver registered sucessfully");

		//Step2 - Establish the connection b/w java and Database
		//JDBC URL SYNTAX:: <mainprotocol>:<subprotocol>:<subname>
		String url="jdbc:mysql://localhost:3306/enterprisejava";
		String username = "root";
		String password = "Harsh123@";
		Connection connection = DriverManager.getConnection(url,username,password);
		System.out.println("Conneciton object is created::" +connection);
		System.out.println("implementation class name of connection is::" +connection.getClass().getName());


		//Step3 - Create a statement object
		Statement statement = connection.createStatement();
		System.out.println("Statement object is created:" +statement);


		//Step4 - Sending and execute the query
		String sqlQuery = "select sid,sname,sage,saddr from student";
		ResultSet resultSet = statement.executeQuery(sqlQuery);
		System.out.println("Resultset object is created:: "+resultSet);

		//Step5 - Process the result from resultset
		System.out.println("ID"+"\t"+"Name"+"\t"+"Age"+"\t"+"Addr");
		while(resultSet.next()){
			Integer id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			Integer age = resultSet.getInt(3);
			String addr = resultSet.getString(4);
			System.out.println(id+"\t"+name+"\t"+age+"\t"+addr);
		}

		connection.close();
		System.out.println("Closing the connection");

	}
}