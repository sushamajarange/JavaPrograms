import java.util.ArrayList;
import java.util.Collections;

public class swapInArrayCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Saanvi");
		arr.add("Charvee");
		arr.add("Rajasi");
		arr.add("Bhumika");
		System.out.println("Before swap : "+arr);
		
		Collections.swap(arr, 0, 2);
		System.out.println("After swap : "+arr);
		
		System.out.println("After swap using for ");
		for(String s : arr) {
			System.out.println(s);
		}
	}

}
