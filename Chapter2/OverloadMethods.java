
class Animal {
	void moveAnimal() {
		System.out.println(" Move Animal in class Animal");
	}
	String stringType() {
		return "Integer type Move method";
	}
}
public class OverloadMethods extends Animal {

	void moveAnimal( int i) {
		System.out.println(" i " +i);
	}
	void moveAnimal(int i, int j) {
		System.out.println(" int two variables " +i+ " " +j);
	}
	void moveAnimal() {
		System.out.println(" In OverloadMethods class ");
	}	
	 public static void main(String[] args){
		OverloadMethods ol1 = new OverloadMethods();
		ol1.moveAnimal();
		ol1.moveAnimal(10,20);
		ol1.moveAnimal(10);
		Animal a1 = new Animal();
		a1.moveAnimal();
		Animal ol2 = new OverloadMethods();
		ol2.moveAnimal();		
		
	 }
}

