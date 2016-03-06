
public class DoWhileLoop {

	public static void main(String[] args) {
		int x =9;
		do		// while loop must have boolean result
		{
			System.out.println("In loop ");
			x ++;
			System.exit(0);
					
		}while(x==9);
		
		System.out.println("Past the loop ");	// It'll  not print b'coz the exit method exits the main 
	}

}

