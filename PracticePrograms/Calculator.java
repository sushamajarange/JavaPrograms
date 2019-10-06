import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a, b, action;
		System.out.println("Enter first no : ");
		a = sc.nextInt();
		System.out.println("Enter first no : ");
		b = sc.nextInt();
		
		System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        
		switch(operator) {
			case '+' :
				System.out.println("Sum is " + (a+b));
			    break;
			case '-' :
				System.out.println("Substraction of entered numbers is " + (a-b));
			    break;
			case '*' :
				System.out.println("Multiplication of entered numbers is " + (a*b));
			    break;
			case '/' :
				System.out.println("Division of entered numbers is " + (a/b));
			    break;
			case '%' :
				System.out.println("Modulo of entered numbers is " + (a%b));
			    break;
			default :
				System.out.println("Error !!  Please enter correct operator ..");   
		}
	}

}
