import java.util.Scanner;

public class AverageOfEnteredArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array which you are entering : ");
		
		int len =sc.nextInt();
		int[]values= new int[len];
		int sum = 0;
		System.out.println("Enter values");
		for(int i = 0;i<values.length; i++) {
			values[i] = sc.nextInt();
			sum = sum + values[i];
		}
		System.out.println("Sum is = "+sum);
		System.out.println("Average = "+(sum/len));
	}

}
