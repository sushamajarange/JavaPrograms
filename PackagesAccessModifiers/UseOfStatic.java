class Temp{
	static double averageOfFirst50(){
		return 3;
	}
	public static int srNo;
	public void gerStaticVariable(){
		System.out.println(srNo);
	}
	/* public String str = "Ana";		// static method can not access non-static variable
	static double getString(){
		return str;
	}	*/
}
public class UseOfStatic extends Temp{
	int flatNo = 01;
	static String society = "Shivaji Park";
	static final int age = 10;
	static double averageOfFirst50(){
		int sum=0;
		for(int i=0;i<=50;++i){
			sum = sum +i;
		}
		return sum/50;	
	}
	public static void main(String[] args) {
		//System.out.print(UseOfStatic.flatNo);		// UseOfStatic can not access flatNo variable b'coz its not static need to object ref
		System.out.println("Society name : "+UseOfStatic.society);
		System.out.println("Average of 1 to 50 : "+Temp.averageOfFirst50()); 	// here we called classname dot methodname
		System.out.println("Average of 1 to 50 : "+averageOfFirst50()); 	//by default it call the public class's method
		//double d = averageOfFirst50();
		UseOfStatic uos = new UseOfStatic();
		System.out.println("Flat no. : " +uos.flatNo);		// accessing flatNo b'coz created object
		System.out.println("Society name : "+uos.society);	// with object also, we can call a static variable
		// System.out.println(uos.averageOfFirst50());		// Using object also we can access a method
		// uos.age=20;		// We can not assign a value for age b'coz its final variable
	}
}
