package day27;

import java.util.Arrays;

public class ArraysCopyOf {

	public static void main(String[] args) {
		
		String [] heros = {"Superman","Batman" ,
				          "Aquaman" , "Wonder Woman" ,
				          "The Flash" , "Green Lantern"
		};
		String[] herosCopied = new String[heros.length];
		for (int i = 0; i < herosCopied.length; i++) {
			herosCopied[i] = heros[i] ;
			
		}
		
		
		System.out.println(Arrays.toString( heros ) );
//		
//		// Sort this array 
//		// use for each loop to loop through all of them
//		// if this array has the hero you are looking for
//		// print Bingo
//		
		Arrays.sort(herosCopied);
		System.out.println(Arrays.toString( herosCopied ) );
		System.out.println(Arrays.toString( heros ) );
		
		for (String dcComic : heros) {
			//System.out.println(dcComic);
			if(dcComic.equals("Batman")) {
				System.out.println("Bingo");
			}
		}
		
		

	}

}
