
class Outer{
	String str = "Outer Class";
	class Inner{
		String str = "Inner Class";
	}
}

public class InnerClassEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		InnerClassEg mainClass = new InnerClassEg();
		
		System.out.println(outer.str);
		System.out.println(inner.str);
		//System.out.println(mainClass.str); Cant not access
	}

}
