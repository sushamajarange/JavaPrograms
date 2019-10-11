import java.util.*;  

class ArrayListEg{
	
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist 
	
		list.add("Red");//Adding object in arraylist  
		list.add("Black");  
		list.add("Pink");  
		list.add("Purple");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  