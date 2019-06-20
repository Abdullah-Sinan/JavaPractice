package day14;

public class MoreStringMethods {

	public static void main(String[] args) {
		// subString(beginningIndex, EndingIndex) : try to cut 
		//beginning index is always inclusive
		//ending index is always exclusive
		
		             //012345
		String name = "Merzet"  ;
		
		//rze
		System.out.println( name.substring(2,5)  );
		// comma is required , space isnt important
		
		// System.out.println( name.substring(5,1)  );
		//it doesnt make sense
		
		//System.out.println( name.substring(1,10)  );
		//we cannt go out of our boundaries .Ours is 6
		
		System.out.println( name.substring(1,6)  );
		//we dont have 6th but it gives us end
		
		
		// Task 1
		// store your name into a string
		// print your last charcter
		//print your first 2 character
		
		/*Optional
		 * print your name starting from middle till the end
		 * 
		 */
		              //0123456
		String name2 = "Dilyara" ;
		int count = name2.length();
		System.out.println( name2.substring(count-1, count) );
		System.out.println( name2.charAt(0));
		System.out.println(name2.substring(0, 2));
		
		int midPoint = count/2 ;
		System.out.println(midPoint) ;
		System.out.println( name2.substring(midPoint, count) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
