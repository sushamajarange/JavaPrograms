
public class OverloadedMethods {
	void takeNotes(String mob){
		System.out.println("Taking notes by using mobile");
	}
	void takeNotes(int lappy){
		System.out.println("Taking notes by using laptop");
	}
	void takeNotes(boolean phone){
		System.out.println("Taking notes by using smart phone");
	}
	
	public static void main(String[] args) {
		OverloadedMethods olm = new OverloadedMethods();
		olm.takeNotes("mobile");
		olm.takeNotes(1);
		olm.takeNotes(true);
	}
}
