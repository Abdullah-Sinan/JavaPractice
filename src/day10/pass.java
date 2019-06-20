package day10;

import java.util.Scanner;

public class pass {

	public static void main(String[] args) {
		
		String username = "User";
		String password = "abc123";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username:");
		username = scan.next();
		System.out.println("Enter password");
		password = scan.next();
		
		boolean userExists = username.contentEquals("user") ;
		boolean passwordCorrect = password.contentEquals("abc123");
		
		if(userExists==true && passwordCorrect==true)
			System.out.println("Login successful");

		else
			System.out.println("Login failed");
		
		scan.close();
	}

}
