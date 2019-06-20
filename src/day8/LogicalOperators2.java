package day8;

public class LogicalOperators2 {

	public static void main(String[] args) {
		 boolean isHungry = true ; // isHungry && isBreakTime
		 boolean isBreakTime = true ;
		 boolean isYourLunchReady = true ;
		 
		 System.out.println("are you hungry and is it break time " + (isHungry && isBreakTime) );

		 
		 System.out.println("are you hungry and is it break time " + (isHungry || isBreakTime) );
		 
		 boolean reverseIsHungry = ! isHungry ;
		 System.out.println(" Original ishungry " + isHungry );
		 System.out.println(" After reversing isHungry " + reverseIsHungry);
		 
		 boolean areWeSuperReady = isHungry && isBreakTime && isYourLunchReady ;
		 
		 System.out.println("hungry , break time , meal is ready " + areWeSuperReady );
		 
	}

}
