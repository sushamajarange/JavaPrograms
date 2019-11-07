import java.util.Scanner;

public class DiscountOnProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Maket price : ");
		int marketPrice = sc.nextInt();
		
		System.out.println("Enter discount : ");
		int dis = sc.nextInt();
		
		int amm = 100 - dis;
		amm = amm*marketPrice / 100;
		System.out.println("Ammout with discount: " +amm);
	}

}
