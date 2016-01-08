
public class Shankarpale {
	int a,b,c,d;
	public void temp(){
		for(a=1;a<=5;a++){
			System.out.println();
			for(b=1;b<=a;b++){
				System.out.print(" * ");
			}
		}
		

		for(c=1;c<=6;c++){
			System.out.println();
			for(d=6;d>=c;d--){
				System.out.print(" * ");
			}
		}
}
	public static void main(String[] args) {
		
		Shankarpale obj = new Shankarpale();
		obj.temp();
	}

}
/*			    
 		Output:-
 				*
				*  * 
				*  *  * 
				*  *  *  * 
				*  *  *  *  * 
				*  *  *  *  *  * 
				*  *  *  *  * 
				*  *  *  * 
				*  *  * 
				*  * 
				* 
*/