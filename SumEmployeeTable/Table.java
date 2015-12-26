class Table {
	public static void main(String[] args) {
		String s = args[0];				// It takes an argument from command line 
		int i = Integer.parseInt(s);	// // It converts string (s) to an integer 
		int j, tab=0;			
		for(j=0;j<10;j++){			// This for loop will execute 10 times, once j=10 it will exit automatically
			tab = i + tab;			// This is printing the the sum	
			System.out.println(tab);	// This will print Table of entered number
		}
		
	}
}