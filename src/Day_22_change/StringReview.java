package Day_22_change;

import java.util.Scanner;

//import java.util.Scanner;

public class StringReview {

	public static void main(String[] args) {
		// Zombie Attach Repl 96
		//each day half of the population is gone by zombie attack
		//example1- inhabitants is 6
		
		// Day 0 [6]
		// Day 1 [3]
		// Day 2 [1]
		//----EXTINCT ----
		
		//Warm Up Now
		
	 
		/*Scanner scan = new Scanner(System.in);
		    int inhabitants = scan.nextInt();
		    int i=0;
		    while( inhabitants>0){
		      System.out.println( "Day "+i+" "+"["+inhabitants+"]");
		      i++;
		      inhabitants= inhabitants/2;
		      
		    }
		    System.out.println("---- EXTINCT ----"); */
		Scanner scan = new Scanner(System.in); 
	    System.out.println("Enter inhabitants count : ");
	    int inhabitants = scan.nextInt(); 
	    
		int day = 0 ; 
	    while(inhabitants>0) {
	      
	      System.out.println("Day "+ day + " [" +inhabitants + "]") ;  
	      inhabitants = inhabitants/2 ; 
	      day++ ;  
	    }
	    
	    System.out.println("---- EXTINCT ----");
		
		

	}

}
