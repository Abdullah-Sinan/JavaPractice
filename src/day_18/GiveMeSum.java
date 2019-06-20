package day_18;

public class GiveMeSum {

	public static void main(String[] args) {
		// how do we get the sum of number
		// starting from one till designed number
		// user input 5 --> 1+2+3+4+5 = 25 ;
		
		int sum = 0 ;
		// 1 + 0 = 1
		// 2 + 1 = 3....
		int count = 1 ;
		
		while ( count<=100) {
			
			sum = sum + count ;
			System.out.println("current sum :" + sum + " count is " + count );
			//System.out.println(count);
			count++ ;
		}
System.out.println(sum);
	}

}
