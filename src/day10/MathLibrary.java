package day10;

import java.util.Scanner;

public class MathLibrary {

	public static void main(String[] args) {
	
		int num1 , num2 , sum ;
       
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter two numbers : ");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		 sum = (num1+num2);
		
		if(sum>100) {
			System.out.println("You entered great numbers");
			
		
		}else {
				System.out.println("Looks like your sum is less than 100");
				
			
		}
			
	}

}
