package day44;

public class Notes {
	/*
	 * Object -- instance of class or actual object created
	 * 
	 * Class
	 *      is a blueprint/ template to an object
	 *      
	 *      fields / variables
	 *        -- instance variable  -- define properties of object
	 *        -- static variable  -- this is coming tomorrow
	 *      
	 *      methods
	 *         --instance methods --->
	 *          we need an object to use it
	 *          and it's mostly used for reading/ manipulating object's property
	 *          
	 *          -- static methods
	 *            no object needed to use it
	 *             and mostly used for utility method
	 *              that has nothing to do with object's properties
	 *              
	 *      Constructor
	 *       -- this is a special block of code that run automatically
	 *           each time an object is being created
	 *        
	 *         how does constructor look like ?  
	 *       -- it has same name as current Class
	 *       -- it does not have return type
	 *       -- it can have any type of access modifier
	 *       
	 *       We can have multiple version of constructor
	 *          -- overloading 
	 *             -- same rule apply as method ( same name different parameter list)
	 *             
	 *             
	 *             AC ac1 = new AC();
	 *             
	 *             public AC{
	 *             
	 *             boolean on;
	 *             
	 *             same name as classname and must not have return type
	 *             THIS IS NOT A CONSTRUCTOR
	 *             It is just a method happen to have same name as class name
	 *             and return type is void
	 *             
	 *             public void AC(){
	 *             system.out.println("boom!");
	 *             }
	 *             
	 *             in Main method
	 *             AC ac1 = new AC();
	 *             
	 *             If a constructor is not defined in the class
	 *             compiler will provide one
	 *                 ----->>> default constructor -- no arg empty constructor
	 *             what if we have any constructor exists in the class 
	 *                 ---->>> we dont get default constructor by compiler
	 *                 
	 *             What's the most useful way to use constructor
	 *                initialize all the field values of an object while being created
	 *          
	 *       Create few job objects and add it to ArrayList<Job> object
	 *       iterate over all items and print them out
	 *       
	 *       if we print out any reference variable directly
	 *       or any object directly
	 *       it will by default call toStrong() method
	 *       
	 *       if you have toString method defined in your own class
	 *       it will print out whatever that method return
	 *       if not we will get Hashcode
	 *       
	 *       when we print out
	 *       List<WrapperType> List<String> objects directly
	 *          it will just show what's inside directly
	 *          
	 *       if it's
	 *       List<CustomType> object and
	 *          if there is toString method defined in that CustomType Class
	 *          it will print out each item as the toString return value
	 *            instead of hashcode
	 *            
	 *        
	 *            
	 */

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
