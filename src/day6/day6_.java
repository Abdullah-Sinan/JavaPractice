package day6;

public class day6_ {

	public static void main(String[] args) {
		// declare a variable offerCount and give initial value of 1 ;
		int offerCount = 1;
		System.out.println(offerCount);
		
		// lets imagine you got 1 offers today -->shorthand assignment to incremenet the value
		
		offerCount += 5 ;
		System.out.println(offerCount);
		//you have rejected 2 of them
		offerCount -=2 ;
		System.out.println(offerCount);
		//then a fter a week , your offer multiplied by 4
		offerCount *=4 ;
		System.out.println(offerCount);
		// then you deciede cut the offer count to half of what you have 
		offerCount /= 2 ;
		System.out.println(offerCount);
		//eventually you want get remainer by 5 :
		
		offerCount %= 5 ;
		System.out.println(offerCount);

	}

}
