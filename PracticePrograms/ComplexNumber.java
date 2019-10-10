/*
 * Complex numbers have two parts – real part and imaginary part. 
 * 
 */

public class ComplexNumber {
	double real, i;
	ComplexNumber(double d1, double d2){
		this.real = d1;
		this.i = d2;
	}
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber comp = new ComplexNumber(0, 0);
		comp.real = c1.real + c2.real;
		comp.i = c1.i + c2.i;
		return comp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber c1 = new ComplexNumber(3.2, 4.2);
		ComplexNumber c2 = new ComplexNumber(5, 6.3);
		ComplexNumber temp = sum(c1, c2);
		System.out.println("Sum is : " +temp.real + " + "+temp.i +"i");
	}

}
