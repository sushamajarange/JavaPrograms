
public class OverloadMethodArgs {
	double calMarks(int i, double j){
		return (i+j)/2;
	}
	int calMarks(int x,int y,int z){
		return (x+y+z)/3;
	}
	double calMarks(double d, int c,int b){
		return (d+c+b)/2;
	}
	public static void main(String[] args) {
		OverloadMethodArgs obj = new OverloadMethodArgs();
		System.out.println(obj.calMarks(34, 52.35));
		System.out.println(obj.calMarks(50, 60, 45));
		System.out.println(obj.calMarks(80, 90, 75));
		System.out.println(obj.calMarks(30.34, 40,35));
	}

}
