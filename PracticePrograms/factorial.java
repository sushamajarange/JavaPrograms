import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int n = 1;
		for(int i = 1; i<=num; i++) {
			n = n * i; 
		}
		System.out.println("Factorial of entered number is : " + n);
	}

}
