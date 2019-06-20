package Day_22_change;

public class lookingForWordInSentence {

	public static void main(String[] args) {
		                    //01234567890123
				String str = "java kava ava " ;
				
				String target = "ava" ;
				
				int firstIndex = str.indexOf( target ) ;
				int lastIndex = str.lastIndexOf( target );
				
				int index = 0 ;
				
				while( index<= lastIndex  ) {
					
				index = str.indexOf(target, index);	
				System.out.println("Found at index : " + index );
				//index = index + 1 ;
				index = index + target.length();
					
				}
				

	}

}
