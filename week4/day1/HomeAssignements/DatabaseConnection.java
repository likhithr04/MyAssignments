package week4.day1.HomeAssignements;

public interface DatabaseConnection { //Interface declaration

	public void connect(); // abstract methods

	public void disconnect();

	public void executeUpdate(String query);

}
