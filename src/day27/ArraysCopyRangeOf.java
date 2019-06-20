package day27;

import java.util.Arrays;

public class ArraysCopyRangeOf {

	public static void main(String[] args) {
		

		
		
		String [] dcComicHeros = {"Superman","Batman" ,
		          "Aquaman" , "Wonder Woman" ,
		          "The Flash" , "Green Lantern"
        };
		
		
		
		// copyRangeOf method take 3 external data / parameters
		// original array , starting index exclusive and ending
		// index exclusive store the resulting array into new array variable
		String[] copyof1to3 = Arrays.copyOfRange(dcComicHeros, 1, 3) ;
		System.out.println(  Arrays.toString(copyof1to3)  );
		
		String[] copyofWtoG = Arrays.copyOfRange(dcComicHeros, 3, 5+1) ;
		System.out.println(  Arrays.toString(copyofWtoG)  );
		
		String[] copyofWto10 = Arrays.copyOfRange(dcComicHeros, 3, 10) ;
		System.out.println(  Arrays.toString(copyofWto10)  );

	}

}
