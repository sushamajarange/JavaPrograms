class AccessVars{
	public int pub = 9;
	private int pvt = 20;
	protected int prted = 30;
	int def = 10;
	

	public void meth1(){
		System.out.println("Public Method");
	}
	private void meth2(){
		System.out.println("Public private");
	}
	protected void meth3(){
		System.out.println("Public protected");
	}
	void meth4(){
		System.out.println("Public Default");
	}
}

public class accessModifiers extends AccessVars{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessVars obj = new AccessVars();
		System.out.println("public : " + obj.pub);
		//System.out.println("Private : "+obj.pvt);
		System.out.println("Protected : "+obj.prted);
		System.out.println("Default : "+ obj.def);
		
		obj.meth1();
		//obj.meth2();		// private can not access
		obj.meth3();
		obj.meth4();
		
	}

}
