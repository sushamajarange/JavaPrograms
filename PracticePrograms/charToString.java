
public class charToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		String str = "Sushama";
		System.out.println("Before");
		System.out.println("Char ch is  = " + ch + "\n"+"String str is = " + str);
		
		String s = Character.toString(ch);
		char c = str.charAt(0);
		
		System.out.println("After");
		System.out.println("Char ch is  = " + c + "\n"+"String str is = " + s);
	}

}
