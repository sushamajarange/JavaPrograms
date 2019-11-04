class Parent{
	int a = 10;
	String str = "Saanvi";
}

public class inheritanceEg extends Parent{

	public static void main(String[] args) {
		
		inheritanceEg obj1 = new inheritanceEg();
		Parent p1 = new Parent();
		
		Parent p2 = new inheritanceEg();
		
		//Parent can not cast into child
		// inheritanceEg p2 = (inheritanceEg) new Parent(); 
		
		obj1.a = 20;
		
		System.out.println("parent.a is : " + p1.a);
		System.out.println("inheritanceEg.a is : " + obj1.a);
		System.out.println("instance is parent "+p2.str);
		
	}

}
