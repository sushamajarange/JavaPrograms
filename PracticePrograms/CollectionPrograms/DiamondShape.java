import java.util.Scanner;

public class DiamondShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j, r;
		r = sc.nextInt();
		
		for(i=0; i<=r; i++)
		{
		     for(j=1; j<=r-i; j++)
		     System.out.print(" ");
		     for(j=1; j<=2*i-1; j++)
		    	 System.out.print("*");
		     System.out.print("\n");
		 }
		 
		 for(i=r-1; i>=1; i--)
		 {
		     for(j=1; j<=r-i; j++)
		    	 System.out.print(" ");
		     for(j=1; j<=2*i-1; j++)
		         System.out.print("*");
		     System.out.print("\n");
		 }
	}

}
