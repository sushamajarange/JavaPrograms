
public class ThrowException {

	public static void getAge(int age) {
		if (age<18) {
			throw new ArithmeticException("No Access !! Your age is below 18");
		}
		else {
			System.out.println("You Have Permission.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getAge(12);
		getAge(30);
	}

}
