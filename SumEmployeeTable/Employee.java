
class Employee {
	int id;			// An integer variable to store employees Id
	String name;	// String variable to store employee name
	
	// parameterised constructor of class Employee which takes values (i.e. Id & name)
	Employee(int id,String name){
		this.id = id;				// this is keyword which is used for current object reference
		this.name = name;
	}
	// this method is used here for printing the employee details
	void print(){
		System.out.println("Id = "+id);
		System.out.print("Name = "+name);
	}
	public static void main(String[] args) {
		Employee emp=new Employee(1,"Vishnu");		//  Here we created a new object of class Employee which passing employees id & name
		emp.print();					// here we call the print() method to print employee details
	}

}
