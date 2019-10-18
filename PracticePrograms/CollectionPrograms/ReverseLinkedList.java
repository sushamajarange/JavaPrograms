import java.util.*;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String> ();
		
		list.add("Diwali");
		list.add("Holi");
		list.add("Chrismas");
		list.add("Padva");
		
		System.out.println("Before descending order");
		System.out.println(list);

		Iterator itr = list.descendingIterator();

		System.out.println("After descending order");
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
