import java.util.Scanner;

public class ConvertFahrenheitToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Fahrenheit ");
		int f = sc.nextInt();
		
		int c = (f-32)*5/9;
		
		System.out.println("Your Fahrenheit is in Celsius : "+c);
	}

}
