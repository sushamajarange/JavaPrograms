import java.util.Scanner;

public class CalElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter units: ");
		int units = sc.nextInt();
		
		double bill = 0;
		
		//bill = units *7;
		if(units <100) {
			bill = units * 1.20F;
		}
		else if(units<300) {
			bill = 100*1.20+(units-100)*2;
		}else if(units>300) {
			bill = 100*1.20+200 *2+(units-300)*3;
		}
		System.out.println("Your payable Bill is " + bill);
	}

}
