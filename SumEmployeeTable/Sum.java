public class Sum {	
	public static void main(String[] args) {
		// try-catch is used for catch an exception
		try{
			String s1 = args[0];				// It takes an argument from command line 
			int first = Integer.parseInt(s1);		// It converts string (s1) to an integer  
			
			String s2 = args[1];				// It takes an argument from command line 
			int second = Integer.parseInt(s2);		// It converts string (s2) to an integer  
			
			int  sum = first + second;					// Make sum of entered numbers
			System.out.println("Sum of entered two numbers = "+sum);	// print sum of 2 numbers
		}	
		catch(NumberFormatException e){
			System.out.println("Number format exception... Please enter number");
		}
	}
}
