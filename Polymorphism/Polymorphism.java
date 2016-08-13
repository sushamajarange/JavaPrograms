class FourWheeler{
	protected void drive(){
		System.out.println("Driver four wheeler ");
	}
}
class TwoWheeler extends FourWheeler{
	protected void drive(){
		System.out.println("Drive two Wheeler");
	}
}
public class Polymorphism {
	void drive(){
		System.out.println("No four wheeler or two Wheeler, in main method");
	}
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism(); p.drive();
		FourWheeler fw = new FourWheeler();		// Drive four Wheeler
		FourWheeler tw = new TwoWheeler();		// Drive two Wheeler
		fw.drive();
		tw.drive();
		fw = tw;
		fw.drive();				// Drive two Wheeler
	}

}
