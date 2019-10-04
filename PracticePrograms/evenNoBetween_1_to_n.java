import java.util.Scanner;

public class evenNoBetween_1_to_n {

	public static void main(String[] args) {
		int num, i = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(i = 0; i<=num; i++) {
			if(num%2 == 0) {
				System.out.print(num + " ");
			}
		}

	}

}
