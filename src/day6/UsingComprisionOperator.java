package day6;

import java.util.Scanner;

public class UsingComprisionOperator {

	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		
		// ask user Q
		System.out.println("Enter number 1 :");
		int num1 = input.nextInt();
		System.out.println("Enter number 2 : ");
		int num2 = input.nextInt();
		
		boolean isGreater = num1 > num2 ;
		
		System.out.println("is number1 greater than number2 : " + isGreater );
		

	}

}
