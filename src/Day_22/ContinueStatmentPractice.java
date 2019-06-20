package Day_22;

public class ContinueStatmentPractice {

	public static void main(String[] args) {
		
		//Task 2.1
		/*
		 * Using For Loop
		 * 
		 *From 1 to 50
		 *
		 *1,print out all the odd numbers
		 *
		 *Task 2.2
		 *
		 *2,count all the number divisible by 4
		 *
		 *Task 2.3
		 *Optionally :
		 *3, skip all numbers divisible by 3 and 5 
		 *at the same time 
		 *4,get the sum of above numbers
		 *
		 */
		
		//for (int i = 1 ; i<50; i = i+2) {
		//System.out.print(i + " " );
		// }
		
	//BEN YAPTIM
		// System.out.println("The odd numbers from 1 to 50 : ");
		// for (int i = 1; i < 50; i++) {
		//	if (i % 2 != 0) {
		//		System.out.println(i + " ");
		//	}
		//	}

	//TASK 2.2 TASK 2.2 TASK 2.2 TASK 2.2 TASK 2.2 TASK 2.2 TASK 2.2 TASK 2.2
		int count = 0 ;
	//	for (int i = 1 ; i <50 ; i++) {
	//		if(i%4==0) {
	//			count = count + 1 ;
				
	//		}
	//	}
	//	for (int i = 1 ; i <50 ; i++) {
	//		if( i%4 !=0) {
	//			continue ;
	//		}
			
	//		count = count + 1 ;  // count++;
			
	//	}
		
	//	System.out.println("Count is : " + count );
		
	//TASK 2.3 TASK 2.3 TASK 2.3 TASK 2.3 TASK 2.3 TASK 2.3 TASK 2.3 TASK 2.3
		int sum = 0 ;
		for (int i = 1 ; i <50 ; i++) {
			if(i%5==0 && i%3==0) {
				continue ;
			}
			
			System.out.println(i + " " );
			sum = sum + i ; 
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
