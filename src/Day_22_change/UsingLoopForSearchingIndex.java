package Day_22_change;


public class UsingLoopForSearchingIndex {

	public static void main(String[] args) {
		
		String str = "ANBCAADKAB" ;
		
		//TASK 1 :
		// loop through each character using subString
		//and print them out with - in between
		
		//OPTIONALLY : avoid the dash in last character
        // try line by line to start with if looping directly is challenging
		//once the sequential numbers show up it will be clear
		//System.out.println( str.substring(0,1) );
		//System.out.println( str.substring(1,2) );
		//System.out.println( str.substring(2,3) );
		//System.out.println( str.substring(3,4) );
		//System.out.println( str.substring(4,5) );
		
		
		for (int i=0; i<=str.length(); i++ ) {
			String eachChar = str.substring(i, i+1 ) ;
			if(i!=str.length()-1)
				System.out.println( eachChar + "-" );
			else
				System.out.println( eachChar );
			// System.out.println( eachChar +( (i!= str.length()-1)? "-" : "") );
		}
		
		
		
		
		
	   // for(int i=0; i<=str.length()-1; i++ ) {
	   //  System.out.println(str.charAt(i) + "-" );
	   // }
	   // System.out.println(str.charAt(str.length()-1));
		
	}

}
