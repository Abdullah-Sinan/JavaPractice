package day30;

public class NumberGame {

	
	public static void main(String[] args) {
		
//		printTheDoubledNumber(10) ; //-->20
//		printTheDoubledNumber(3) ;
		
		// when calling a method that take parameter 
	    // we can either directly pass data of that type like 21
	    // or pass a variable with same type that has that data like i
		checkForAge(21) ;  //  ---> adult
		
		int i = 21 ;
		checkForAge(i) ;
		
		checkForAge(17) ;
		
	}
	//checkForAge(19.55)
	public static void checkForAge(int age) {
        //int age = 19.55 ;
		
		if(age >18) {
			System.out.println("adult ");
		}else {
			System.out.println("not an adult");
		}
		
	}
	
	
       // int num is called method parameters
	public static void printTheDoubledNumber(int num) {
		//body goes here
		
		int doubledNum = num * 2 ;
		System.out.println(num+" was doubled --> " + doubledNum);
		
	}
	


}

//Task 2 
		/*2.1
		 * create a static method with no return type
		 * called printTheDoubledNumber
		 * it takes 1 int as a parameter
		 * and it will print out doubled number on the console
		 * 
		 * 2.2
		 * create a static method with no return type
		 * called checkForAge
		 * it takes 1 int as a parameter
		 * inside body , check whether the age is more than 18
		 * if the age is more than 10 --> print adult
		 * if not print not an adult
		 * 
		 * */
