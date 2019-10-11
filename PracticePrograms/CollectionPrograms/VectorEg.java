import java.util.*;

public class VectorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();  

		v.add("Jarange");
		v.add("Patekar");
		v.add("Joshi");
		v.add("Chaudhari");
		String str = v.lastElement();
		
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		System.out.println("lastElement() : " +str);  
	}

}
