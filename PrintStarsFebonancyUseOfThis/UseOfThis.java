
public class UseOfThis {

	int id;  
    String name,city;  
    UseOfThis(){
    	System.out.println("default constructor is invoked");
    }  
      
    UseOfThis(int id,String name){  
    	this ();				//it is used to invoke current class constructor.  
    	this.id = id;  
    	this.name = name;  
    }  
    UseOfThis(int id,String name, String city){  
    	this (id,name);			//it is used to invoke current class constructor with parameter i.e. is & name.  
    	this.city = city;   
    }
    void display(){
    	System.out.println(id +" "+ name +" "+ city);
    }  
      
	public static void main(String[] args) {
		UseOfThis o1 = new UseOfThis(111,"Abc");  
		UseOfThis o2 = new UseOfThis(222,"Xyz","Pune");  
	    o1.display();  
	    o2.display();

	}

}
