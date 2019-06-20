package day10;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter your name please");
		
		String name = scan.next();
		
		
		boolean nameEqualToExpected = name.contentEquals("Tahir");
				
		System.out.println(nameEqualToExpected);
		
		//if(nameEqualToExpected){
		if( name.contentEquals("Tahir") ) {
			
			System.out.println("That's Tahir");
		}else {
			System.out.println("Not Him !! ");
			
			
			
			
		}
		
		
		//String name = "Tahir" ;
		
		//boolean b = ( name == "Lachyn");
		// we use method from String class called equals
		
		//boolean b = name.contentEquals("Lachyn");
		
		//System.out.println(b);
		
		// Task 2
		//Create a name variable to store your name
		//create a scanner to ask for a name
		//compare the name with what you entered
		//print out thats my name if its equal
		//print out thats not my name if its not
		
				
				
		

	}

}
