package Day26;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		
      String str = "Spartan" ; //7 is size
        //before string
//      int size = str.length() ;
//      char[] myChars = new char[size];
//      myChars[0] = str.charAt(0) ;
//      myChars[1] = str.charAt(1) ;
//      myChars[2] = str.charAt(2) ;
//      myChars[3] = str.charAt(3) ;
//      myChars[4] = str.charAt(4) ;
//      myChars[5] = str.charAt(5) ;
//      myChars[6] = str.charAt(6) ;
//      System.out.println(Arrays.toString(myChars)  );
      
      
      
      //after string
//      int size = str.length() ;
//      
//      char[] myChars = new char[size]; //size is count of element,7
//      
//      for(int i=0; i<myChars.length ; i++) {
//    	  //myChars.length instead of that you can use size
//    	  //myChars[0] = 'A';
//    	  myChars[i] = str.charAt(i) ;
//    	  
//      }
//      
//      System.out.println(Arrays.toString(myChars) );
      //toCharArray method is a methos form string class
      //and it will take no external data when being called
      //and it will return character array that have each char of String object
      
        char[] myChars = str.toCharArray();
        System.out.println(Arrays.toString(myChars)  );
      
	
	
	}

}
