package day8;

public class LogicalOperatorPractice {

	public static void main(String[] args) {
		
		int score = 10 ;
		boolean result1 =  score > 4 ;
		boolean result2 = score > 4 && score < 11 ;
		
		boolean result3 = score > 14 && score < 11 ; // 10>14 False and stop 
		boolean result4 = score > 14 || score < 11 ; // 10>14 False or 10<11 True
		
		// boolean result5 = score++> 10 && score < 12 ;  // 10>10 False
		//boolean result5 = score > 10 & ++score < 13 ; // 10>10 false or 11<13 true
		
		// boolean result5 = score > 9 || score <1 ; // 10>9 True
		// boolean result5 = score > 10 | ++score < 13 ; // 10>10 false or 11<13 true 
		boolean result6 = !true && true ;
		
		boolean result7 = (score > 5 ) && ( 6 > 5 ) ; // True true --- True
		boolean result8 = (score > 5 ) && !( 6 > 5 ) ; // True false --- False
		
		boolean result9 = (score > 5 ) && ( score > 11 ) && ( score/2 == 5 )  ; // True False
		boolean result10 = (score > 5 ) && ( score <= 11 ) && ( score/2 == 5 )  ; // True true True
		
		
		
		System.out.println("the value of score right now : " + score );
		
		
		
		System.out.println("result is " +  result1 );
		System.out.println("result is " +  result2 );
		System.out.println("result is " +  result3 );
		System.out.println("result is " +  result4 );
	

	}

}
