import java.util.Scanner;

public class simpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal : ");
		float principalAmm = sc.nextInt();

		System.out.print("Enter the Rate of interest : ");
		float rateAmm = sc.nextInt();
		
		System.out.print("Enter the Time period : ");		
		float time = sc.nextInt();
		
		System.out.println("Interest of ur entered values : "+ (principalAmm*rateAmm*time)/100);
	}

}
