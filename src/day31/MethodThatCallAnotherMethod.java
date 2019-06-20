package day31;

public class MethodThatCallAnotherMethod {

	public static void main(String[] args) {
		
		MethodReturnTypeIntro x = new MethodReturnTypeIntro();
		String a = x.giveMeMyName();
		System.out.println(a);
		
		/*
		 * Step1: boil the water
		 * Step2: add pasta to the water
		 * Step3: add some olive oil
		 * Step4: add salt
		 * Step5: mix it and taste it
		 * Step6: put it in a plate
		 * 
		 */
//		System.out.println("Step1: boil the water");
//		System.out.println("Step2: add pasta to the water");
//		System.out.println("Step3: add some olive oil");
//		System.out.println("Step4: add salt");
//		System.out.println("Step5: mix it and taste it");
//		System.out.println("Step6: put it in a plate");
//		prepare();
//		addIngridient();
//		tasteAndBringToTheTable();
		
		AskSpouseToPrepareMeal();

	}
	
	public static void AskSpouseToPrepareMeal() {
		
		prepare();
		addIngridient();
		tasteAndBringToTheTable();
		
	}
	
	public static void prepare() {
		System.out.println("Step1: boil the water");
		System.out.println("Step2: add pasta to the water");
	}
    public static void addIngridient() {
	System.out.println("Step3: add some olive oil");
	System.out.println("Step4: add salt");
	}
    public static void tasteAndBringToTheTable() {
	System.out.println("Step5: mix it and taste it");
	System.out.println("Step6: put it in a plate");
    }


}
