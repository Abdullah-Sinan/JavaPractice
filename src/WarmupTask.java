
public class WarmupTask {

	public static void main(String[] args) {
		
				
				float cucumber_price = 2.5f ;
				int _tomatoes_price = 3 ; 
				double onion_price = 1.5f ;
				int pepper_price = 2 ;
				int carrot_price = 4 ;
				
				System.out.println("1 cucumber is " + cucumber_price + "$" );
				System.out.println("4 Tomatoes are " + _tomatoes_price*4 + "$");
				System.out.println("2 Onion is " + onion_price*2 + "$");
				System.out.println("1 Pepper is " +  pepper_price + "$");
				System.out.println("6 Carrot is " + carrot_price*6 + "$" ) ;
				
				
				double totalPrice = cucumber_price + _tomatoes_price*4 + onion_price*2 + pepper_price + carrot_price*6 ;
				
				System.out.println( "Total price : " + totalPrice );
				
				
				
	}

}
