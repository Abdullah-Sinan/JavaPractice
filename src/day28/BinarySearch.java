package day28;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		int [] nums = {4, 5, 6, 11, 19, 20, 54} ;
		//int [] nums = {11,20,4,6,54,5,19,5} ;
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums) );
		// Array object must be sorted before using this method
		
		int index = Arrays.binarySearch(nums, 5) ;
		System.out.println(index);
		
		int idx20 = Arrays.binarySearch(nums, 20) ;
		System.out.println(idx20);
         //If we dont have the item in the array
		//we will get minues number to point the insertion point of the array
		// to keep this array sorted
		
		// {4, 5, 6, 11, 19, 20, 54} ; -->inserting here ,this is our original array
		//////////// {4, 5, 6, 10, 11, 19, 20, 54};
		//  {4, 5, 6, 11, 19, 20, 54, 100};
		
		int idx10 = Arrays.binarySearch(nums, 10) ;
		System.out.println(idx10);
		
		int idx100 = Arrays.binarySearch(nums, 100) ;
		System.out.println(idx100);
		// {4, 5, 6, 11, 19, 20, 54}
		int idx3 = Arrays.binarySearch(nums, 3) ;
		System.out.println(idx3);
		
		
		int[] nums100 = new int[100] ;
		Arrays.fill(nums100,  5);
		System.out.println(Arrays.toString(nums100));
		
		// {4, 5, 6, 11, 19, 20, 54}
				
	}

}
