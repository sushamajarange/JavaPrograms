import java.util.Scanner;

public class findNoOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		
		for(int i = 1; i<str.length(); i++) {
			if(str.charAt(i) == 'A' || str.charAt(i) == 'E' ||str.charAt(i) == 'I'||str.charAt(i) == 'O'||str.charAt(i) == 'U'||str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Number of vowels are : " +count);
	}

}
