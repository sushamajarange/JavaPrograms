import java.util.*;

public class PriorityQueueEg {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();  
		
		queue.add("Sush");
		queue.add("Raj");
		queue.add("Saanvi");
		queue.add("Pinki");
		queue.add("Vishnu");
		
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr = queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		
		queue.remove();// remove()- returns head of the queue, if queue is empty throws exception
		queue.poll(); // poll()- return head of the queue, if queue is empty returns null
		System.out.println("after removing two elements:");  
		Iterator<String> itr2 = queue.iterator();
		
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  

	}

}
