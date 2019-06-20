package day32;

public class MethodWithNoReturn {

	public static void main(String[] args) {
		
        String name = "Aliya" ;
        //name.charAt(0) actually return a value so println can print out
        System.out.println( name.charAt(0) );
        
        //System.out.println( printSomething() );
        //why this is complaining ?
        //printSomething doesnt return a value when being run
        // but println method is expecting a value so it does not compile
		
	}
	
	public static void printSomething() {
		System.out.println("Class is Over");
	}

}
