import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many natural noumbers you are entering : ");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[]values= new int[len];
		int sum = 0;
		System.out.println("Enter Natural Numbers");
		for(int i = 0;i<values.length; i++) {
			values[i] = sc.nextInt();
			sum = sum + values[i];
		}
		System.out.println("Sum of naural numbers is = "+sum);
	}
}
