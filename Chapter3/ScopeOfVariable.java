public class ScopeOfVariable
{
	static int si = 10;		//Static variable
	int x;				//Instance variable

	{
		x = 20;
		int x2 = 12;		//initializer block
	}

	ScopeOfVariable()
	{
		si = 90;
	}
	void go(){			// Method
		boolean test = false;	//Local variable
		for(int i=0;i<5;i++){	
			if(i==2)
				test =true;
				System.out.println(test);
		}
	}
	public static void main(String []args)
	{
		ScopeOfVariable sov = new ScopeOfVariable();
		sov.go();
		System.out.println(si);
	}
}
