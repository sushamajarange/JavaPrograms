class Table {
	public static void main(String[] args) {
		// try-catch is used for catch an exception
		try{
			String s = args[0];				// It takes an argument from command line 
			int number = Integer.parseInt(s);	// It converts string (s) to an integer  
			for(int j=1;j<=10;j++){				// This for loop will execute 10 times, once j=11 it will exit automatically
				System.out.println(j*number);	//Print table
			}
		}
		// If user entered other than number it will catch the exception and show the message to user
		catch(NumberFormatException e){
			System.out.println("Number format exception... Please enter number");
		}
	}
}