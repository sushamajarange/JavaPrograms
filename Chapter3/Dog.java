class Coller {
}
class Dog {
	Coller c;
	String name;

	public static void main(String args[]){
		Dog d;
		d = new Dog();
		d.go(d);
	}
	void go(Dog dog){
		c = new Coller();
		dog.setName("Aiko");
	}
		void setName(String dogName) {
		name = dogName;	
	}
}
