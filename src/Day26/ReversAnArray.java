package Day26;

import java.util.Arrays;

public class ReversAnArray {

	public static void main(String[] args) {
		
		//reverse this array so the value of numbers array
		// will be in reverse order
		                //0 ,1,2 ,3,4,5-->there re 6 items 3 swap
//		int[] numbers = { 11,2,39,7,4,15};
//		System.out.println(Arrays.toString(numbers) );
//		
//		int count = numbers.length ;
//		
//		int temp = numbers[0] ;
//		numbers[0] = numbers[5] ;
//		numbers[5] = temp ;
//		
//		temp = numbers[1] ;
//		numbers[1] = numbers[5-1] ;
//		numbers[5-1] = temp ;
//		
//		temp = numbers[2] ;
//		numbers[2] = numbers[5-2] ;
//		numbers[5-2] = temp ;
//		
//		System.out.println(Arrays.toString(numbers) );
		
		//We added 18 and made odd number . Middle point is 18.
		//we have 7items
		
		int[] numbers = { 11,2,39,18,7,4,15};
		System.out.println(Arrays.toString(numbers) );
		
		int count = numbers.length ;
		int lastIndex = count -1 ;
		
		for (int i = 0 ; i< count/2 ; i++) {
			int temp = numbers[i] ; //1 is here i
			numbers[i] = numbers[lastIndex-i] ;
			numbers[lastIndex-i] = temp ;
			
		}
		
		System.out.println(Arrays.toString(numbers) );
		

	}

}
