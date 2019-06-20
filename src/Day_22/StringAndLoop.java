package Day_22;

public class StringAndLoop {

	public static void main(String[] args) {
		
		// Every for loop can be written in while loop
		
		// use for loop to print your name char by char
		// and print reverse order char by char
		// OPTIONALLY Save it into another variable
		
		
		// use for loop to print your name char by char
		 
		/*   String value = "Sinan";
	        
	        for (int i = 0; i < value.length(); i++) {
	            char c = value.charAt(i);
	            System.out.println(c);
	        }
		*/
	       String name = "Dilnur" ;
	       for (int d = 0 ; d<name.length(); d++ ) {
	    	   System.out.print(name.charAt(d) + " ");
	    	}
	       System.out.println();
	       for (int d = name.length() -1 ; d>= 0 ; d-- ) {
	    	   System.out.print(name.charAt(d) + " ");
	       }
	       
	       
	       /* We used to do
	        * int x = 0 ;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x++;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x++;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x++;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x++;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x++;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x++; 
	        * 
	        * String newStr= "" ;
	        * int x = name.length() -1 ;
	        * newStr = newStr + name.charAt(x) ;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x--;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x--;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x--;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x--;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x--;
	        * System.out.print(name.charAt(x) + " " ) ;
	        * x--;
	        */
	
	       // Task 3.3
	       String newStr = "" ;
	       for (int d = name.length() -1 ; d>= 0 ; d-- ) {
	    	  // System.out.println(name.charAt(d) + " " );
	    	   char eachChar = name.charAt(d) ;
	       }
	        
	        
	        
	}

}
