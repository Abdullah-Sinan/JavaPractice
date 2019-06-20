package day_10;

import java.util.Arrays;

public class replt132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int [][] multiplicationTable = new int[10][10];
		    
		    //TODO: type your code below
		    
		  int counter = 0;
		  int cont = 1;
		  int sayac=0;
				 
		  for (int i = 0; i < multiplicationTable.length; i++) {
			for (int j = 0; j < multiplicationTable.length; j++) {
				multiplicationTable [i][j] = counter+cont;
				counter=counter+cont;
				sayac++;
				if(sayac%10==0) {
					cont++;	
					counter=0;
					
				}
				
				
			}
		}
		  
		  
		    
		    //Do not modify below line it will be used to test your code. And 
		    //Can be used by you while developing your code
		  
		    System.out.println(Arrays.deepToString(multiplicationTable) ) ;

	}

}
