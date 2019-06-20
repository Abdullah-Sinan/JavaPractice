package day10;

public class MultiBranchIfStatmentIntro {

	public static void main(String[] args) {
		// Grade book
		int score = 43;
		
		//if the score is between 90-100 A
		//if the score is between 80-89 B
		//if the score is between 70-79 C
		//Else D and print study harder
		
		if( score > 90 ) {
		
		System.out.println("You got A ");
		}else if(score>=80 && score<90) {
			System.out.println("You got B");
		}else if(score>=70 && score<80){
			System.out.println("You got C");
		}else {
			System.out.println("study harder");
			
		}
		
		
		



	}

}
