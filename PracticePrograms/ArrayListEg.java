import java.util.ArrayList;

public class ArrayListEg {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
				
		ar.add("Sush");
		ar.add(11);
		ar.add("Saanu");
		ar.add(10);
		ar.add(05);
		ar.add(17);
		
		do{
			System.out.println(ar);
		}while(ar == null);
	}

}
