package Day25;

import java.util.Scanner;

public class ScannerAndArray2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int [3] ;
		
		for ( int i = 0 ; i< arr.length ; i++) {
			System.out.println("enter number " + (i+1) );
			arr[i] = scan.nextInt();
			System.out.println( arr[i] );
			
		}
		
		
		//bad way to get the max
		//initial value preferably the first item
//		int max = 0 ;
//		for ( int i = 0 ; i< arr.length ; i++) {
//			
//			if(arr[i] > max ) {
//				max  = arr[i] ;
//				
//			}
//		}
//		System.out.println("max value is : " +max);
		
		
		int min = arr[0] ;
		for ( int i = 0 ; i< arr.length ; i++) {
			
			if(arr[i] < min ) {
				min = arr[i] ;
				
			}
		}
		System.out.println("min value is : " + min );
		

	}

}
