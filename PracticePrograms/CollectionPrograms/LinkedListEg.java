import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Number> l = new LinkedList <Number>();
		l.add(10);
		// l.add("temp text");		// ERROR
		l.add(20);
		l.add(50);
		Iterator<Number> itr = l.iterator();  
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		} 
		
		LinkedList <String> ls = new LinkedList <String>();
		ls.add("First");
		ls.add("Second");
		ls.add("Third");
		ls.add("Fourth");
		
		Iterator<String> itrs = ls.iterator();  
		
		while(itrs.hasNext()){  
			System.out.println(itrs.next());  
		} 
		
	}

}
