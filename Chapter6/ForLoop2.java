
public class ForLoop2 {

	public static void main(String[] args) {
		int i=0,j = 5;
		for(;i<=5;){
			System.out.println("In loop ");
			i++;
		}
		for(; ;){
			System.out.println("Inside an endless loop "); 	// It goes infinite loop without break (we can use return also)
			break;
		}
	}
}

