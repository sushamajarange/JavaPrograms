import java.util.Scanner;

public class findLeapYear {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4 == 0) {
			System.out.println(year + " is a Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
	}

}
