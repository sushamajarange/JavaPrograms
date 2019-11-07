import java.util.Scanner;

public class FindAreas {
	int res = 0;
	private void parellelogram() {
		int height, breadth;
		System.out.println("Enter Height & Breadth ");
		Scanner sc1 = new Scanner (System.in);
		height = sc1.nextInt();
		breadth = sc1.nextInt();
		res = height * breadth;
		System.out.println("Area of Parallelogram is: " + res);      
	}
	
	private void areaOfCircle() {
		double r, res = 0 ;
		System.out.println("Enter radius : ");
		Scanner sc1 = new Scanner (System.in);
		r = sc1.nextInt();
		res = 3.14 * r * r;
		System.out.println("Area of Circle is: " + res);  
	}

	private void areaOfRectangle() {
		int height, base;
		System.out.println("Enter Height & base ");
		Scanner sc1 = new Scanner (System.in);
		height = sc1.nextInt();
		base = sc1.nextInt();
		res = height * base;
		System.out.println("Area of Rectangle is: " + res);
	}

	private void rhombus() {
		int r;
		System.out.println("Enter rhombus : ");
		Scanner sc1 = new Scanner (System.in);
		r = sc1.nextInt();
		res = 4*r;
		System.out.println("Perimeter of rhombus is: " + res);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAreas fa = new FindAreas();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Select: \n1 for parellelogram \n2 for Area of circle \n"
				+ "3 for Area of ractangle \n4 for perimeter of Rhombs");
		int num = sc.nextInt();
		switch(num) {
			case 1:
				fa.parellelogram();
				break;
			case 2:
				fa.areaOfCircle();
				break;
			case 3:
				fa.areaOfRectangle();
				break;
			case 4:
				fa.rhombus();
				break;
		}
	}
}
