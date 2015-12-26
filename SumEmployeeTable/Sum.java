
public class Sum {	
	public static void main(String[] args) {
		String s1 = args[0];				// It takes an argument from command line 
		int i = Integer.parseInt(s1);		// It converts string (s1) to an integer  
		
		String s2 = args[1];				// It takes an argument from command line 
		int j = Integer.parseInt(s2);		// It converts string (s2) to an integer  
		
		int  sum = i + j;					// Make sum of entered numbers
		System.out.println("Sum = "+sum);	// print sum
	}

}
