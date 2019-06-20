package abc;

public class NestedLoop {

	public static void main(String[] args) {
		
        // Dry Principle
		// Do not repeat yourself
		
//		for (int j = 0 ; j < 3 ; j++ ) {
//			for (int i = 1 ; i < 6 ; i++ ) {
//				System.out.print(i + " " );
//			}
//			System.out.println();
//		}
		
		//Task 2 :
		//print from 15- 5 in one line
		//repeat this 4 times
	
		//I DID IT	
//		for (int j = 0 ; j < 5 ; j++ ) {
//			for (int i = 15 ; i > 4 ; i-- ) {
//				System.out.print(i + " " );
//			}
//			System.out.println();
//		}
		for ( int j =0 ; j<4 ; j++ ) {
			System.out.println("Iteration " + (j+1) );
		for (int i =15 ; i>=5 ; i-- ) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		}
		
		
		
		
			
			//System.out.println(i + " ");
		//}
		
//		for (int i = 1 ; i < 6 ; i++ ) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
		
		
		
//		for (int i = 1 ; i < 6 ; i++ ) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 1 ; i < 6 ; i++ ) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 1 ; i < 6 ; i++ ) {
//			System.out.print(i + " ");
//		}
//		System.out.println();

	}

}
