package day41;

import day40.*;

public class StudentTester {

	public static void main(String[] args) {
		
		
		Student muammer = new Student();
		muammer.name = "muammer" ;
		muammer.age = 27 ;
		muammer.ssn = 1234567 ;
		
		muammer.displayName();
		
		
		// BankAccount is in different package 
		BankAccount acc1 = new BankAccount();
		
		
		//System.out.println(acc1.balance);
		//System.out.println(acc1.accountHolder);
		//acc1.add100Dollar();
		
		
		
		
//		muammer.displayNameAndAge();
//		muammer.showSSN();
		
		

	}

}
