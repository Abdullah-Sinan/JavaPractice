package day10;

public class CondPrac {

	public static void main(String[] args) {
       
		
		int i = 10 , j = 21 ;
		
		
		if((i>5)  && (j%2==1) && (i+j ==31) ){
			
			System.out.println("BINGO !!!");
		}else {
			System.out.println("try again spartans");
		
		}
		//i is more than 5 or j is odd number or sum is 30 
		if( (i>5) || (j%2==1) || (i+j==30) ) {
			System.out.println("Bingo");
		}else {
			System.out.println("Try again");
		
		}
		
		

	}

}
