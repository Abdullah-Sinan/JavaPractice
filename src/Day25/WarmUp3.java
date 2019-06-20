package Day25;

public class WarmUp3 {

	public static void main(String[] args) {
		//Print A-Z 26 times in 26 rows
		//Modify the code to print as below
		//A
		//AB
		//ABC
		//ABCD
		//Below gives A-Z 27 times
//		for (int i = 1 ; i<=26; i++) {
//			
//		for (int c = 'A' ; c<='Z'; c++) {
//			System.out.print( (char)c + " ");
//		}
//		System.out.println();
//		}
		
		
		for ( int i ='A' ; i<='Z' ; i++) {
			
		for (int c = 'A' ; c<=i; c++) {
			System.out.print( (char)c + " ");
		}
		System.out.println();
		}
		
		
	
		
		
		
		
		
	}

}
