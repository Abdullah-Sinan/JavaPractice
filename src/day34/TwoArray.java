package day34;

import java.util.Arrays;

public class TwoArray {
	
	public static int[][] get2DArray(int row , int col){
		
	
        int[][] twoDArr = new int[row][col] ;
        
        //System.out.println(Arrays.deepToString(twoDArr)  );
        
        for ( int i = 1; i<=row ; i ++) {
        	System.out.println("row num : " + i);
        	
        	for ( int j = 1; j<=col ; j ++) {
        		//System.out.println("col num : " + j + " | ");
        		twoDArr[i-1][j-1] = j ; 
        	}
        	System.out.println();
        }
        System.out.println(Arrays.deepToString(twoDArr)  );
		return twoDArr;
	}
	
	

	public static void main(String[] args) {
		
        int[][] twoDArrObj = { {2,3,7} , {4,8,9}  };
        
       // System.out.println(Arrays.deepToString(twoDArrObj) );
		
		
        //twoDPrinter (twoDArrObj) ;
        
        int row=2 , col=3 ;
        
	}    
	
	public static void twoDPrinter(int[][] twoD) {
		
		//System.out.println(Arrays.deepToString(twoD) );
		for(  int[] eachArr : twoD ) {
			
			for (int eachNum : eachArr ) {
				
				System.out.print(eachNum + " ");
			}
			System.out.println();
		}
		
		
	}
	
	
	// Task 2 :
	
		/*
		 * create a method called twoDPrinter
		 * accept one 2D int array object as parameter
		 * and print them all out in excel like row and column
		 * 
		 * int[][] twoDArrObj
		 * 
		 * create a method called get2Darray
		 * accept 2 int as parameters row,col
		 * return 2D array object in below logic :
		 * 
		 *      get2Darray(2,3)  --->> { {1,2,3},{1,2,3} }
		 * 
		 * 
		 */

}
