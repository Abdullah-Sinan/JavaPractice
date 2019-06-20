package day8;

public class MoreLogicalOperator {

	public static void main(String[] args) {
		// Logical and operator &&
		//As long as one operand is false whole thing will be false
		//Only when both operands are true then whole thing will be true
		
		// Logical or operator  ||
		//As long as one operand is true whole thing will be true
		//ONLY WHEN both operands are false then WHOLE THING WILL BE FALSE
		
		
		// Logical not operator    !
		
		// difference between single & | and && || is
		//&& will only eveluate first part if the whole result can be decided
		// just using the first boolean value
		// & will check for both side whether it can be already decided using 
		//boolean value
		
		System.out.println("result of (true && true )" + (true && true )  );
		System.out.println("result of (false && true )" + (false && true )  );
		System.out.println("result of (true && false )" + (true && false )  );
		System.out.println("result of (false && false )" + (false && false )  );
		
		System.out.println("result of (true || true )" + (true || true )  );
		System.out.println("result of (false || true )" + (false || true )  );
		System.out.println("result of (true || false )" + (true || false )  );
		System.out.println("result of (false || false )" + (false || false )  );
		
		System.out.println("result of !true " + (!true));
		System.out.println("result of !false " + (!false));

	}

}
