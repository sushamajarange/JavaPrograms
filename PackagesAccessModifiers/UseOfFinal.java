class temp{
	static String name ="Sam";
}	// We can create multi classes (whether public class is final then also we can create multi classes)
public final class UseOfFinal {
	static int i = 10;
	static int j = 20;
	static int c = i+j;
	// If we don't declare these variable as a static then we can't access in main()
	final void print(){
		System.out.println("Final method");
	}
	
// public class UseOfFinal1 extends UseOfFinal		// We can't extends the final class
	public static void main(String[] args) {
		UseOfFinal ob = new UseOfFinal();
		System.out.println(temp.name);
		ob.print();
		System.out.println("Addition : "+c);
	}

}
