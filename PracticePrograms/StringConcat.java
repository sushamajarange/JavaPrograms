import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String : ");
		String str1, str2;
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		System.out.println("Concated String using concat method : " + str1.concat(str2));
		System.out.println("Concated String using + operator : " + str1+str2);
	}

}
