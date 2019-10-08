import java.util.Scanner;

public class NoOfDigitsInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int count = 1;
		for(int i=0; i<num;i++) {
			num /= 10;
			count++;
		}
		System.out.println("number of digits are : "+ count);
	}

}
