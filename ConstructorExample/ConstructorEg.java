
public class ConstructorEg {
	int rollNo;
	String name,address;
	ConstructorEg(){
		System.out.println("User defined Constructor with no argument");
	}
	void ConstructorEg(){
		System.out.println("Class name and method name same so its not constructor b'coz return type is void");
	}
	ConstructorEg(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	ConstructorEg(int rollNo, String name,String address){
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
	}	
	void display(){
		System.out.println("Roll no - "+rollNo);
		System.out.println("Name - "+name);
		System.out.println("Address - "+address);
	}
	public static void main(String[] args) {
		ConstructorEg cg1 = new ConstructorEg();
		cg1.ConstructorEg();
		ConstructorEg cg2 = new ConstructorEg(01,"Avni","Pune");
		//here I'm not passing address but in display() their are 3 terms so for the address it will print null
		ConstructorEg cg3 = new ConstructorEg(02,"Pari");
		cg2.display();
		cg3.display();
	}

}
