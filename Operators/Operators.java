
public class Operators {

	public static void main(String[] args) {
		int a=10, b=10,c=5;
		System.out.println(a=b);
		System.out.println(a==b);
		System.out.println(++a + a++ + b);
		boolean b1 = true;
		
		System.out.println(b1);
		System.out.println(b1=false);
		System.out.println(b1=true);
		System.out.println(a>b);
		System.out.println(a>c && b>c );
		System.out.println(a<c && b>c );
		System.out.println(!(a>c) );
		System.out.println(!(c>b));
		System.out.println(a<c || b>c );
		System.out.println(a++ > 10 || ++b < 30);
		System.out.println(a <= 99 || a <= 33 && b == 10);
		System.out.println(a >= 99 && a <= 33 || b == 10);
		
		System.out.println(++a + a++);
		
		int int1 = 10, int2 = 20, int3 = 30;
		System.out.println(int1 % int2 * int3 + int1 / int2);
		System.out.println(int1 % int2 * (int3 + int1) / int2);
	}

}
