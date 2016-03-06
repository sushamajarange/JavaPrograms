
public class WhileLoop {

	public static void main(String[] args) {
		int x =3;
		while(x==3)		// while(x=3) is not legal
		{
			System.out.println("X is equal to 3 ");
			//--x;		// ++x
			//If --x or ++x is not here then the below exit method will exit the loop otherwise it'll go infinite loop
			System.exit(0);
		}
		
	}

}

