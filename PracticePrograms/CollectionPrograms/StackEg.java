import java.util.*;

public class StackEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> st = new Stack <String>();
		st.add("Java");
		st.push("HTML");
		st.add("C++");
		st.push("CSS");
		st.push("Bootstrap");
		
		Iterator<String> itr = st.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		System.out.println("st.capacity() : " +st.capacity());		// 10
	}

}
