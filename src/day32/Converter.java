package day32;

public class Converter {

	public static void main(String[] args) {
		System.out.println( meterToCM(15) );
		System.out.println( FeetToInch(10) );
		
		System.out.println( fahrToCel(81)  );
		   // the method return double--double can not be saved in int variable
		      //int cel = fahrToCel(81) ;
		//this is what we would do if we want to store the result in a variable
		double cel1 = (int) fahrToCel(81);
		System.out.println(cel1);
		
		//new requirement:
		//what if i want to get the result as int
		//without changing the method return type to int
		//but store the generated result as int
		
		int cel = (int) fahrToCel(81) ; //downcast 
		//int cel = (int) 27.22222222;
		System.out.println(cel);

	}
	
	public static int meterToCM(int meter) {
		//100 cm = 1 meter
		return meter*100;
	}
	public static double FeetToInch(int feet) {
		double inch = (double) feet*12; //upcasting and optioanl
		return inch;
	}
	public static double fahrToCel (double fahr) {
		
		return (fahr-32)*5/9;
	}
	
	// create a method called meterToCM
	// it takes one int as parameter and return CM
	
	// create a method called FeetToInch
	// it takes one int as parameter and return Inch
	
	// create a method called FatToCelcius
	// it takes one double as parameter and return celcius as double

}
