import java.util.Scanner;

public class findAreaAndPerimeter {

	public static void main(String[] args) {
	     float a, b; 
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter Height : ");
	     a = sc.nextFloat();
	     System.out.println("Enter width : ");	    
	     b = sc.nextFloat();
	     System.out.println("Area = " + (a*b));
	     System.out.println("Perimeter = " + (a+b)*2);
	}

}
