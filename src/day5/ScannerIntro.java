package day5;

import java.util.Scanner;


public class ScannerIntro {

	public static void main(String[] args) {
		
		// Create a scanner object
		Scanner userInput = new Scanner(System.in);
		
        // ask user questions
        System.out.println( " Enter your name please : ");
   
        // store user input
        // next() method will read one word
        String name = userInput.next();
   
        // print what user input
        System.out.println("you have entered : " + name );
		
	}

}
