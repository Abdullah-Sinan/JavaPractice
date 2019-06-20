package day33;

import java.util.Arrays;

public class ReturningMultipleValue {

	
	
	public static void main(String[] args) {
	
		
		int[] myArray = giveMeArray();
		System.out.println( Arrays.toString(myArray) );
		
		//Calling is one shot
		System.out.println( Arrays.toString(giveMeArray() ) );
		
		
		
	}
	
	// this method have no parameter
	//and return int array object as returned value
	public static int[] giveMeArray() {
		
		int[] arr = new int[] {1,2,3} ;
		//return Arrays.toString(arr) ;
		return arr ;
		
	}
	
	// Task 2 
	/*
	 * create a static method called combine Array
	 * it takes 2 double array as parameters
	 * and return another double array with 2 array items combined
	 * 
	 * example result of calling this method
	 * {1.1,3.99, 2.2} {2.4,2.88} --->{1.1,3.99,2.2,2.4,2.88}
	 * */
	

}
