package Day26;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayPractice {

	public static void main(String[] args) {
		
		
		// Task 2
		// get user input using scanner as String name
		// turn it into char Array and count letter a
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter a name: ");
		String name = scan.next();
		//Ask user to ebter the char to count
		//since we can not store input as a cahacter
		//we will just ask for String then turn it into character
		
		//for example if user entr "A" --> "A".charAt(0) -->'a'
		System.out.println("Enter char to count ");
		String userCharstr = scan.next();
		char charToLookFor = userCharstr.charAt(0);
		
		
		char[] nameChars = name.toCharArray();
		System.out.println( Arrays.toString(nameChars) );
		
		int counter = 0 ;
		
		for (int i = 0; i < nameChars.length; i++) {
			
			if( nameChars[i] == charToLookFor ) {
				counter ++ ;
			}
			
		}
		
		System.out.println( "The count of " + charToLookFor +": "+ counter );

	}

}
