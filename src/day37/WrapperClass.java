package day37;

public class WrapperClass {

	public static void main(String[] args) {
		
		//Byte b = new Byte( (byte) 123);
		
		//upcasting/type widening
		//10 is literally considered as int
		//10--->> 10L and stored inside long variable
		long lval = 10 ;
		
		//what is the wrapper type for Long ?
		Long lRef = 10L ; // what is happening in here ?autoboxing !
		//10L will become new Long(10L) as object and assigned to lRef
		
		//reference type does not care about the range
		// it only care about the relationship between types
		// range compatible assignement only works for primitive numbers
		//BELOW CODE DOES NOT WORK
		//Long lRef2 = new Integer(10);
		
		
		// This always mislead programmer to think as below
		// 10--> 10L by type widening | or upcasting
		// and then 10L autoboxed to Long Object
		// BIG NO !!!!!!
		// COMPILER IS LAZY --> IT ONLY TAKES ONE STEP !
		// for example : it either only take action of
		// 10 --> 10L or 10--> New Integer(10)
		// BIG BAD !!! COMMON TRICKY EXAM | INTERVIEW QUESTIONS
		// Long lRef3 = 10 ;
		
		
		Double d = 3.14 ; // autoboxing
		
		
		// compiler can not turn int 3 into double object in one step
		// and compiler only willing to take one step so it does not work
		// STEP 1 : 3 ---> 3.0d   upcasting
		// STEP 2 : 3.0d --> new Double(3.0d); // autoboxing
		// BIG BAD
		// Double badD = 3 ; 
		
		
		
//		printByteValue( (byte)10 );
//		
//		byte b = 12 ;
//		printByteValue(b);
		

	}
	
	
	public static void printByteValue(byte b) {
		
	 System.out.println(b);	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
	}

}
