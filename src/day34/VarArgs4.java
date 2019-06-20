package day34;

public class VarArgs4 {

	public static void main(String[] args) {
		
		// varArgs -- is represented in method parameter using ...
		/*
		 * ... Can only be used as method parameters
		 *  it can not be used anywhere else
		 *  
		 *  Calling a method that have varArg
		 *  we directly pass variable number of arguments
		 *  You may also pass an array --(not so common but possible)
		 *  
		 *  What if we have more than one parameter in methods
		 *  if there is multiple parameters VarArgs should be last one
		 *  
		 *  Multiple varargs in one method parameters are not allowed
		 *  you can have at most one varArg in one method
		 *  
		 *  a method that takes varArg as parameter can accept an array object
		 *  as an argument 
		 *  
		 *  a method that takes array as parameter can accept an varArg 
		 *  as an argument 
		 *  
		 */
     	doSomething("magic horse" , 1,2,3,4,45,5,6,7,8,8,9,9);
     	
//		doSomething(1,2,4,5,"Magic Horse" ); 
//		doSomething(5,"Magic Horse" ); 
	
	
	}
	
		public static void doSomething(String name, int... nums) {
			System.out.println("do something was called");
			
		}
		
		/*
		 * if there is multiple parameters VarArgs should be last one
		 */
		

	

}
