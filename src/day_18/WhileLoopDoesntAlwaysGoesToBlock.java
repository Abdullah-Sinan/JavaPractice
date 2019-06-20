package day_18;

public class WhileLoopDoesntAlwaysGoesToBlock {

	public static void main(String[] args) {
		
		
		int x = 100 ;
		while(x>200) {
			System.out.println("do something");
			x = x+ 1000 ;
		}
		
		System.out.println(" END ");

	}

}
