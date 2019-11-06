abstract class Animal{
	public abstract void AnimalMethod();
	public void AnimalMethodWithBody() {
		System.out.println("I'm in abstract class");
	}
}
public class AbstractClassEg extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassEg obj = new AbstractClassEg();
		obj.AnimalMethod();
		obj.AnimalMethodWithBody();
	}

	@Override
	public void AnimalMethod() {
		System.out.println("Animal Method");
	}

}
