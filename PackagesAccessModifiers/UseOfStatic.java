public class UseOfStatic {
	int flatNo = 01;
	static String society = "Shivaji Park";
	public static void main(String[] args) {
		//System.out.print(UseOfStatic.flatNo);		// UseOfStatic can not access flatNo variable b'coz its not static need to object ref
		System.out.println("Society name : "+UseOfStatic.society);
		
		UseOfStatic uos = new UseOfStatic();
		System.out.println("Flat no. : " +uos.flatNo);		// accessing flatNo b'coz created object
		System.out.println("Society name : "+uos.society);	// with object also, we can call a static variable
		
	}

}
