package day43;

public class Product {
	
	private String name; 
	  private float rating; 
	  private double price; 
	  private String productId;
	  
	  // create a method to set the value of all fields
	  // 
	  public void initilizeAllFieldValue(String name,float rating,double price, String productId ) {
		  
		this.name = name ;
		this.rating = rating ;
		this.price = price;
		//this.productId = productId;
		// Optionally
		// you can do above by calling setter method
		setProductId(productId);
		  
	 }
	  
	  
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public float getRating() {
	    return rating;
	  }
	  public void setRating(float rating) {
	    this.rating = rating;
	  }
	  public double getPrice() {
	    return price;
	  }
	  public void setPrice(double price) {
	    this.price = price;
	  }
	  public String getProductId() {
	    return productId;
	  }
	  public void setProductId(String productId) {
	    this.productId = productId;
	  } 
}

////4 access modifier to define access level of fields of methods 
//public      --- accessible anywhere
//protected   -- stay tuned for later
//default(no) -- package private 
//private     -- in same class only 
//
//Good Encapsulation practice 
//making instance fields private 
//and providing public getter/setter for the filed for access and modify 
//
//getter -->> a method for getting the value of your field and the name is specifically recomended in getFieldName() format  and return the value of field
//
//setter -->> a method for setting the value of your field and the name specically sugested to have 
//setFieldName(dataType fieldName) and it will set new value for the field and it does not return value 
//
//
//
//Create a class called Vehicle 
//with few private fields model , make , speed 
//create getters and setters for all those private fields 
//
//create methods : 
//	increaseSpeed : it accepts one parameter increaseBy as int 
//	and increase the speed to new speed. 
//	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->11->12->13->14->15->
//
//	decreaseSpeed  : 
//	it accepts one parameter decreaseBy as int 
//	and decrease the speed to new speed. 
//	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->9->8->7->6->5->
//
//
//this keyword : 
//	is used to address the current object that being worked on 
//	we can use it to address the instance field of the class 
//		this.fieldName 
//	we can also use it to address the instance method of the class 
//
//
//Customer should be able to view 
//Product detail 
//
//noun -->> you can think of a class
//
//Customer 
//	name, password,primemeber
//	viewProduct() browse()
//
//Product 
//name, rating, price , item
