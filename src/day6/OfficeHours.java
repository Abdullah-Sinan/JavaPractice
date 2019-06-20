package day6;

import java.util.Scanner;

public class OfficeHours {

	public static void main(String[] args) {
		
//shorthand operators 
		
		int a = 5;
		int b = 10;
		int result = 0;
		
		result = a + b;
		System.out.println(result);
		int c = 3;
		result = result - c;
		// -=, +=, /=, *=, %=  they are shorthand operators
		result -= c;
		System.out.println(result);
		//result -= c; it's the same as result = result - c;
		result += b;
		System.out.println(result);
		result *= b;
		System.out.println(result);
		// post incremental operation
		//in this way we can increase value by 1
		//result++; it's the same as result = result + 1;
		result++;
		System.out.println(result);
		//in this way we can decrease value by 1
		result--;
		//result--; it's the same as result = result - 1;
		System.out.println(result);
		//shortcut for import in eclipse control + shift + o 
		//we are creating scanner object
//		Scanner scan = new Scanner(System.in);
		//take one word from the console 
		//System.out.println("Please enter your hometown: ");
		//if we have more than one word, we need to use nextLine(); 
		//String word = scan.nextLine();
		//System.out.println("Are you serious?");
		//boolean bool = scan.nextBoolean();
		//System.out.println("My hometown is: "+word);
		//System.out.println(bool);
//		System.out.println("What's your city?");
//		String city = scan.nextLine();
//		System.out.println("What's your ocupation?");
//		String ocupation = scan.nextLine();
//		System.out.println("My city is: "+city+", and my ocupation is: "+ocupation);
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your first name  :");
		String firstName = userInput.next();
		System.out.println("You have entered :"+firstName);
		System.out.println("Enter your last name  :");
		String lastName = userInput.next();
		System.out.println("You have entered :" + lastName);
		System.out.println("Enter your state and city  :");
		// this nextLine() receives empty input
		userInput.nextLine();
		String cityState = userInput.nextLine();
		System.out.println("You have entered :" + cityState);
		System.out.println("Enter your nationality :");
		String nationality = userInput.next();
		System.out.println("You have entered :" + nationality);
		System.out.println("Enter your age :");
		int age = userInput.nextInt();
		System.out.println("You have entered :" + age);
		System.out.println(" Thank you!");

	}

}
