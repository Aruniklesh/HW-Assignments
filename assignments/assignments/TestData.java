package week2.assignments;

public class TestData extends LoginTestData  {
	void enterCredentials(){
		System.out.println("Enter your Credentials: ");
	}
	
	void navigateToHomePage(){
		System.out.println("Back to home page");
	}
	public static void main(String[] args) {
		
		TestData test = new TestData();
		test.enterCredentials();
		test.enterUsername();
		test.enterPassword();
		System.out.println("Login Successfull");
		test.navigateToHomePage();
	}

}
