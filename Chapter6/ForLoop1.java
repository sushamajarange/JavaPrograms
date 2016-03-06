
public class ForLoop1 {

	public static void main(String[] args) {
		int i,j = 5;
		for(i=0;i<=5;i++){
			System.out.println("In loop ");
			System.out.println("J = "+j);
			//System.exit(0);		if this is uncommented, it'll print once "in loop"
		}
		
		System.out.println("Past the loop ");	// It'll  not print b'coz the exit method exits the main 
	}
}

