package abc;

public class abcForWeekend {

	public static void main(String[] args) {
		//write a program 
		// aaabbccc -> abc
		
		String str = "aaabbccc" ;
		String uniqueStr = "" ;
		
		for (int i = 0 ; i < str.length() ; i++) {
			String eachChar = str.substring(i,i+1) ;
			
			if( !uniqueStr.contains(eachChar) ) {
				uniqueStr += eachChar ;
				//System.out.println(eachChar); ->it gives alt alta
			}
		}
         System.out.println(uniqueStr);		//it gives abc

	}

}
