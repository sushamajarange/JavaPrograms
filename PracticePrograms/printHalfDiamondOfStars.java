
public class printHalfDiamondOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i = 0; i<=5; i++) {
			for(j = 1; j <= 2*i-1; j++)
		       System.out.print("*");
		    System.out.println();
		}
		
		for(i = 4; i>=0; i--) {
			for(j = 1; j <= 2*i-1; j++)
		       System.out.print("*");
		    System.out.println();
		}
	}
}
