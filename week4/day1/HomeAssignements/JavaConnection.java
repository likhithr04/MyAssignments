package week4.day1.HomeAssignements;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {
	// Concrete class implementing the interface
	@Override
	public void connect() {
		System.out.println("connection sucesfully");
	}

	@Override
	public void disconnect() {
		System.out.println("disconnection succesfull");
	}

	@Override
	public void executeUpdate(String query) {
		System.out.println(query);
	}

	public static void main(String[] args) {

		JavaConnection db = new JavaConnection(); 
		db.connect();
		db.executeUpdate("UPDATE employees SET salary = salary * 1.1 WHERE department = 'HR' ");
		db.executeQuery();
		db.disconnect();
	}
}
