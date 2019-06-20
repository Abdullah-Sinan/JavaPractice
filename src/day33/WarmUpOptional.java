package day33;

public class WarmUpOptional {

	public static void main(String[] args) {
//		 create a method that take one string parameter as sentence
//         return first character for
//         first word Oword and all characters of last word except first char
//         example : Love Java --> Lava 

		String sentence = "Take a Break";//"I Love Java" ;//"Hold the Door" ; //"Love java" ;
		
		
		                               //argument
		System.out.println( getMyString(sentence) );
		
		
		
		
	}
	
	public static String getMyString(String sentence) {
		
		String firstChar = sentence.substring(0,1) ;
		String[] allWords = sentence.split(" ") ;
		String lastWord = allWords[allWords.length-1];
		
		String targetWord = firstChar + lastWord.substring(1) ;
        return targetWord;
		
		
		
	}

}
