package day13;

public class Warmup {

	public static void main(String[] args) {
		int x = 67 ;
		String result = "Unknown" ;
	
		
		if(x>70) {
			result = "pass" ;
			
		}else {
			 result = "fail" ;
			
		 }
		result = (x>70) ? "pass" : "fail" ;
		System.out.println(result);
		

	}

}
