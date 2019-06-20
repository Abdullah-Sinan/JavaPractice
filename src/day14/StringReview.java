package day14;

public class StringReview {

	public static void main(String[] args) {
		/*
		 * String class method
		 * 
		 * 1 , length() --> to count charhacter
		 * 
		 * String name = "Mamatjan" ;
		System.out.println( name.length());
		 *  2, to uppercase --> it makes all letters Upper
		 *  
		 *  System.out.println( name.toUpperCase());
		 * 
		 * 3 , to lowercase --> it makes all letters lower
		 * 
		 * System.out.println( name.toLowerCase());
		 * 
		 * 
		 * 4 , to pick a charcter in a word 
		 * 
		 * char secondChar = name.charAt(2) ;
		   System.out.println(secondChar);
	
		   
		 */

		String name = "Mamatjan" ;
		System.out.println( name.length());
		
		System.out.println( name.toUpperCase() );
		
		System.out.println( name.toLowerCase());
		
		char secondChar = name.charAt(2) ;
		System.out.println(secondChar);
		
		
		int lastIndex = name.length()-1 ;
		System.out.println(  name.charAt(lastIndex)  );
		
		/*
		 * length() taking no external data and returning a number
		 * 
		 * first charcter index is always 0
		 * last charcter index is always one less than actual count of
		 * character 
		 * int lastIndex = strgth(gth()-1
		 * 
		 * charAt(1) taking 1 external data/argument and 
		 * returning a character
		 * 
		 * str.charAt(lastIndex) ;
		 * 
		 */
		// equality
		
		//System.out.println( name.equals("Mamatjan") );
		//System.out.println( name.equalsIgnoreCase("Mamatjan") );
		
		// contains
		
		boolean containsOrNot = name.contains("aam") ;
		System.out.println(containsOrNot); 
		
		// indexOf
		// return the index of first occurance of the string
		//given if it does not exist it will return -1
		// in exact match it gives 0
		
		
		System.out.println( name.indexOf("am")  );
		System.out.println( name.indexOf("t")  );
		System.out.println( name.indexOf("Mamatjan") );
		System.out.println( name.indexOf("mamatjan") );
		
		String uName = name.toUpperCase();
		System.out.println( uName.indexOf("MAMATJAN"));
		
		// optional
		
		System.out.println(  name.toUpperCase().indexOf("MA") ) ;
		
		
		// System.out.println(  name.length().indexOf("MA") ) ;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
