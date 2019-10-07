import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0, result = 0, check = num;
		
		while(num > 0){
			a = num % 10;
			num = num / 10;
			a = a*a*a;
			result = result + a;
		}
		
		if(result == check) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}

}
