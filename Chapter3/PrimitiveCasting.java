
public class PrimitiveCasting {
	private   String def;
	public String getString(){
		return def;
	}
	public void bar(){
		int i1 = 100;
		PrimitiveCasting p1 = new PrimitiveCasting();
	}

	public static void main(String[] args) {
		PrimitiveCasting pc = new PrimitiveCasting();
		System.out.println("instance variable " + pc.getString());
		//String str = pc.def.toLowerCase();
		//System.out.println("str " +str);
		int arr[] = new int[100];
		System.out.println("Array of int variable " +arr[2]);
		boolean b[] = new boolean[3];
		System.out.println("Array of boolean variable " +b[1]);
		//System.out.println("Local object " +p1.i1);		// Can't access
		
	}

}

