public class GreatestNumber {
	 public static int k=3;
	public int main(int[] args){
		return 0;
	}
	void temp(){
		int k=4;
		System.out.println(k);
	}
	public static void main(String[] args) {
		GreatestNumber obj=new GreatestNumber();
		int i,j;System.out.println(k);
		obj.temp();
		i=obj.main(args[0]);
		j=obj.main(args[1]);
		if(i<j){
			System.out.println("First number is greater from those numbers which you entered");
		}
		else{
			System.out.println("Second number is greater from those numbers which you entered");
		}
	}
	private int main(String string) {
		// TODO Auto-generated method stub
		return 0;
	}	
}


