package week2.assignments;

public class APIClient {
	
	void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
	
	void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint);
		System.out.println(requestBody);
		if(requestStatus) {
			System.out.println("Request is Successfull");
		}else {
			System.out.println("Request is NOT Successfull");
			}
		}
	
	

public static void main(String[] args) {
	APIClient api = new APIClient();
	api.sendRequest("The END");
	api.sendRequest("End", "RequestBody", true);
}
}
