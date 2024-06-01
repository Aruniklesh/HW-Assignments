package week2.assignments;

import java.util.Scanner;

public class LoginTestData {

	void enterUsername() {
		System.out.println("Enter USERNAME: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
	}
	void enterPassword() {
		System.out.println("Enter PASSWORD: ");
		Scanner sc = new Scanner(System.in);
		int password = sc.nextInt();
	}
}
