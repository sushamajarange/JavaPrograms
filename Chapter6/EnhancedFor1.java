
public class EnhancedFor1 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5} ;
		int i;
		/*for(i=0;i<a.length;i++){		// Basic for loop
			
			System.out.println(a[i]);
		}*/
		for(int j:a){			// Enhanced for loop
			System.out.println(j);
		}
		int x;
		long x2;
		long [] la = {7L,8L,9L};
		int twoD[][] = {{1,2,3},{4,5,6},{6,7,8}};
		String names[] = {"Sush", "Vishnu", "Patekar"};
		Animal [] animal = (new Dog(), new Cat()};
		for(long y : la){System.out.println(y);}
		for(int[] n: twoD){System.out.println(n);}
		for(int n2 : twoD[2]){System.out.println(n2);}
		for(String s:names){System.out.println(s);}
	}
}

