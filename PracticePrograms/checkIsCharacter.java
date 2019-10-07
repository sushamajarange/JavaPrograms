import java.util.Scanner;

public class checkIsCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char : ");
		char ch;
		ch = sc.next().charAt(0);
		
		if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')){
			System.out.println(ch + " is a characher");
		}
		else
			System.out.println(ch +" It's not a characher");
		
	}

}
