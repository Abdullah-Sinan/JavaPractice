package Day_22_change;

public class substringPractice {

	public static void main(String[] args) {
		
		             //012345678901234567890123456
		String song = "Name : Ba Ba Black Sheep Ba" ;
		
		String target = "Ba" ;
		
		int indexOf1Ba = song.indexOf("Ba") ;
		System.out.println(indexOf1Ba);   //output is 7
		
		// indexOf(string, beginningIndex)
		int indexOf2Ba = song.indexOf("Ba" ,indexOf1Ba + 2 ) ;
		
		System.out.println(indexOf2Ba);  //output is 10
		
		int indexOf3Ba = song.indexOf("Ba" ,indexOf2Ba + 2 ) ;
		
		System.out.println(indexOf3Ba);  //output is 25
		
		
		
		

	}

}
