package day8;

public class TypeConversion {
	
	// Converting from one data type to another data type 
	// converting from smaller data type to bigger type is called 'Type widening / upcasting
	//converting from bigger data type to smaller type is called 'Type narrowing / downcasting
	// downcasting require explicit casting operation for example 
	// long grande = 1000L ; int medium = (int) grande ;
	
	public static void main(String[] args) {
	//int medium = 10 ;
	// byte , short , int , long 
	//shot , tall , medium , grande // starbucks cup size
	
	//long grande = 10 ;
	
	//long grande = medium ;
	
	//System.out.println( grande );
	
	/// type widening / upcasting
	//short tall = 5L ; can not put a long value inside any variable that has smaller range
	
	// short tall = grande ; // type narrowing / downcasting 
	
	//double superGrande = 15.67d ;
	//int mediumCup = (int) superGrande ;
	
	//System.out.println( mediumCup); 
	 
	byte tinyExpressoCup = 2 ; 
	// type widening 
	
	int mediumCup = tinyExpressoCup ; 
	
	

	
	
	}

}
