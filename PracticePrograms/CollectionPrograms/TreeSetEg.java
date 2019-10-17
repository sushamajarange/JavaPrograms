import java.util.*;

public class TreeSetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <String> tr = new TreeSet <String>();
		
		tr.add("Magnum");
		tr.add("Vanila");
		tr.add("Chocolate");
		tr.add("TootyFrooty");
		
		Iterator <String> itr =  tr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Last element is : "+tr.last());
	}

}
