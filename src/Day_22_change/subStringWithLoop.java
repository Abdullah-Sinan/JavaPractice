package Day_22_change;

public class subStringWithLoop {

	public static void main(String[] args) {
		
		// Task 2
		
		// given String str = "ABCDEFGH"
		
		// print 2 letter at a time compared to one from previous tasks
		// ABCDEFGH  --> AB CD EF GH
		            //01234567890
		String str = "ABCDEFGHIJK" ;
		
		for ( int i = 0 ; i < str.length(); i+=2 ) {
			if(i!=str.length()-1)
			System.out.print( str.substring(i, i+2) + " " );
			else
				System.out.println(str.substring(i));
			
		}
		System.out.println();
		for ( int i = 0 ; i < str.length(); i+=3 ) {
			if(i!=str.length()-2)
			System.out.print( str.substring(i, i+3) + " " );
			else
				System.out.println(str.substring(i));
			
		}
		
		
//		System.out.println( str.substring(0, 0+2)  + " " );
//		System.out.println( str.substring(2, 2+2)  + " " );
//		System.out.println( str.substring(4, 4+2)  + " " );
//		System.out.println( str.substring(6, 6+2)  + " " );
//		System.out.println( str.substring(8, 8+2)  + " " );
		
	}

}
