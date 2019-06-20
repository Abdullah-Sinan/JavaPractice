package day41;

public class Student {

	
	// access modifiers
	/*
	 * public / protected / default / private
	 * 
	 * we can use it for any methods
	 * we can use it for fields
	 * 
	 */
	
	
//public	String name;
//public	int age;
//public	long ssn;
	String name;
	int age;
	long ssn;
	
	
	public void displayName() {
		System.out.println("name is : " + name);
	}
	
	// it is only accesible within same class
	// which means Student class only
	private void displayNameandAge() {
		System.out.println("name is : " + name + "| age is " + age );
	}
	
	// it is only accesible within same class
	// which means Student class only
	private void showSSN() {
		System.out.println("SSN is : " + ssn);
	}
	
}
