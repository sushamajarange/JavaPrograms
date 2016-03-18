
class Animal {
	 void moveAnimal() {
		System.out.println(" Move Animal in class Animal");
	}
}
public class OverridenMethods extends Animal  {

	void moveAnimal() {
		System.out.println(" Move Animal '  overriden method ");
	}
	 public static void main(String[] args){
		OverridenMethods om1 = new OverridenMethods();
		om1.moveAnimal();
		Animal a1 = new Animal();
		a1.moveAnimal();
		Animal om2 = new OverridenMethods(); //--> can not create like this line without extending a class Animal
		om2.moveAnimal();		// It calls the method of class 'OverridenMethods'
		
	 }
}

