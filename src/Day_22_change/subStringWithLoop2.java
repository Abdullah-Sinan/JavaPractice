package Day_22_change;

public class subStringWithLoop2 {

	public static void main(String[] args) {
		
		// Task 2 
		            //01234567890123
		String str = "java kava ava " ;
		
		// print 2 letter at a time compared to one from previous tasks
		// ABCDE  --> AB BC CD DE EB BC
		
		// Count the number of BC on this String
       
		int count = 0 ;
        int countOfChars = str.length();
        String target = "ava" ;
        int targetLength = target.length() ;
        
		
		
		
		//		int count = 0 ;
		
		for (int i = 0 ; i < str.length() - targetLength +1; i++) {
			
			String word = str.substring(i,i+ target.length() ) ;
			//System.out.println(word);
			if(word.equals(target) ) {
				count++;
				System.out.println(i);
			}
			
		}
		System.out.println(count);
		
		
		
		
		
		
//		System.out.println(str.substring(0,0+1) );
//		System.out.println(str.substring(1,1+1) );
//		System.out.println(str.substring(2,2+1) );
//		System.out.println(str.substring(3,3+1) );
//		System.out.println(str.substring(4,4+1) );

	}

}
