package day32;

public class Utility {

	public static void main(String[] args) {
		
      String name = "Emine";
      System.out.println( name.length() );
         //There are two ways to call statci methods
      //1,if the method is in same class
      //we can just call directly call the method by it's name
      // and passing the value it required
      //2, or we can use className.static methodName(params)
      
      
      
      
       //we can use directly staticMethod (params ) to call static methods
		System.out.println(   giveMeFive()   );
		//we can use className.staticMethod (params ) to call static methods
		System.out.println(  Utility.giveMeFive()  );
		
		int myNum = giveMeFive();
		System.out.println(myNum);
		
		
		
		
	}
	
	public static int giveMeFive() {
		
		return 5 ;
		
	}
	
	

}
