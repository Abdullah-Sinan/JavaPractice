package abc;

public class ArrayIntro {

	public static void main(String[] args) {
		
        int i1 = 10 ;
        int i2 = 20 ;
        int i3 = 30 ;
        int i4 = 40 ;
        int i5 = 50 ;
        
        //we declared int array variable and we assigned
        //and int array object
        //that has capacity of 5
        int[] numbers = new int[5];
        //System.out.println(numbers);
        
        //Assigning value to array
        numbers[0] = 10 ;
        numbers[1] = 15 ;
        numbers[2] = 28 ;
        numbers[3] = 20 ;
        numbers[4] = 3 ;
		
        System.out.println(numbers[2] );
        
        //Task 2
        // create an array of double with size 4
        // assign 4 value
        // then print then all out
        
        double[] numbers2 = new double[4];
        numbers2[0]= 1.5;
        numbers2[1]= 1.75;
        numbers2[2]= 2.0;
        numbers2[3]= 2.25;

        System.out.println(numbers2[0]);
        System.out.println(numbers2[1]);
        System.out.println(numbers2[2]);
        System.out.println(numbers2[3]);

	}

}
