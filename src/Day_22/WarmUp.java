package Day_22;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// Use do  while loop 
		// Ask user two number
        // Keep asking until the sum of 
		//two numbers are more than 100
		// print the end after the loop
		// optional : 3 attemps only 
	     
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		
		int x=0 , y = 0 ;
		int tryCount = 0 ;
		do {
			System.out.println("Enter num1");
			x = scan.nextInt();
			System.out.println("Enter num2");
			y = scan.nextInt();
			++tryCount ;
			if(tryCount==3) {
				System.out.println("You Lost !!! ");
				break;
			}
			
		}while( x+y <= 100) ;
		System.out.println("The End");
		
		// int num1 = scan.nextInt();
		// int num2 = scan.nextInt();
		

	}

}
