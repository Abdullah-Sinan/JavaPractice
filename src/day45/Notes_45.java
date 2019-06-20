package day45;

public class Notes_45 {
	
	// calling a Constructor
	/*
	 * Where : when object is being created
	 *    a constructor can only be called inside another constructor of same class
	 *    RULE :
	 *      this(arg...)  use this keyword with () and pass arguments if needed
	 *      1, it has to be in first statement of constructor body
	 *      2, ONLY ONE call is allowed inside one constructor
	 *      3, recursive constructor call is not allowed  ---- COMPILER ERROR
	 *      
	 *      public Caller() {
		
		this(100);
		System.out.println("calling no arg");
		
	}
	
	public Caller(int x) {
		
		this();
		System.out.println("calling 1 arg");
		
	}
	         METHOD vs CONSTRUCTOR
	         
   METHOD -- has return type can have any name and can take certain action
	            and can be called upon request
   CONSTRUCTOR -- has no return type has same name as class name
	         will be called each time an object is being created
	         only a constructor can call another constructor of same class
	         using this(args...)
	         
	         
	         A constructor can call another method in same class
	         A method CAN NOT CALL constructor in any circumstances 
	
	
	 */

}
