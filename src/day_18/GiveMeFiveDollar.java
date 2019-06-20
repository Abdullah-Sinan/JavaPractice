package day_18;

import java.util.Scanner;

public class GiveMeFiveDollar {

	public static void main(String[] args) {
		//
		//ask user to enter $5 bill or $10 bill
		//if user enter sth else keep asking
		
		Scanner scan = new Scanner(System.in);
		int x = 0 ;
		
		// as long as i dont get 5 or 10 i keep asking
		// 
		
		while(  ! (x ==5 || x==10)    ) { // while( x!=5 && x!=10)
			System.out.println("Enter $5 or $10 ");
			x= scan.nextInt();
			
		}
		System.out.println("End of Loop");

	}

}
