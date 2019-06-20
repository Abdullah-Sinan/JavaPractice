package day_10;

import java.util.Scanner;

public class GraderApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Score here");
		
		int score = scan.nextInt();
		if(score > 90) {
			System.out.println("Great score : A!");
			
		}else if( score > 80 ) {
			System.out.println("Good score : B!");
			
		}else if ( score > 70 ) {
			System.out.println("Ok Score : C !!");
		}else {
			System.out.println("Study Harder");
		}
		
	}

}
