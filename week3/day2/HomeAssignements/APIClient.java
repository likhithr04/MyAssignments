package week3.day2.HomeAssignements;

public class APIClient {

	public void sendRequest(String endpoint) {
		
		System.out.println(endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		
		System.out.println(endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		APIClient api =new APIClient();
		api.sendRequest("/api/v1/users");
		api.sendRequest("/api/v1/login", "{ \"username\": \"admin\", \"password\": \"1234\" }", true);
	}

}
