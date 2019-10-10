import java.util.Scanner;

public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine(), 2);
		String st = Integer.toOctalString(num);
		System.out.println("Integer of entered binary is : "+st);
	}

}
