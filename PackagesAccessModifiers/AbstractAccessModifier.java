abstract interface ByDefaultAbstract{
	// By default an interface is abstract, whether we declare it abstract or not
}
abstract class AbstractAccessModifier {
	int a=10;		// We can not define an abstract variable
	
	abstract void print(); // If we declare abstract method then it don't have method body & class must be an abstract.
	private void withMethodBody(){
		System.out.print("This is without abstract ");
		}
	public static void main(String[] args) {
		// We can not declare an object of an abstract class
		// AbstractAccessModifier ob = new AbstractAccessModifier();
		
	}

}
