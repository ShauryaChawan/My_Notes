import java.sql.*;

public class JDBCExample {

	// JDBC URL, username, and password of MySQL server
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
	private static final String USERNAME = "username";
	private static final String PASSWORD = "password";

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		PreparedStatement preparedStatement = null;
		CallableStatement callableStatement = null;
		ResultSet resultSet = null;

		try {
			// Step 1: Load and register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2: Establish connection to MySQL database
			connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

			// Step 3: Create a Statement object
			statement = connection.createStatement();

			// Step 4: Execute a query using Statement
			String sqlQuery = "SELECT * FROM mytable";
			resultSet = statement.executeQuery(sqlQuery);

			// Step 5: Process the ResultSet
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				System.out.println("ID: " + id + ", Name: " + name);
			}

			// Step 6: Create a PreparedStatement
			String sqlInsert = "INSERT INTO mytable (id, name) VALUES (?, ?)";
			preparedStatement = connection.prepareStatement(sqlInsert);
			preparedStatement.setInt(1, 4);
			preparedStatement.setString(2, "John Doe");
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println(rowsAffected + " row(s) affected.");

			// Step 7: Create a CallableStatement for calling a stored procedure
			callableStatement = connection.prepareCall("{call getEmployeeById(?)}");
			callableStatement.setInt(1, 1); // Assuming employee ID 1
			resultSet = callableStatement.executeQuery();

			// Process the CallableStatement ResultSet
			while (resultSet.next()) {
				int empId = resultSet.getInt("id");
				String empName = resultSet.getString("name");
				System.out.println("Employee ID: " + empId + ", Employee Name: " + empName);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// Step 8: Close all JDBC resources
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (callableStatement != null)
					callableStatement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
