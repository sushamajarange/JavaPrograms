
public class SwitchEgStringMatch {

	public static void main(String[] args) {
		String str="Sushama";
		switch (str){
		case "Vishnu":
			System.out.println("String is Vishnu");
			break;
		case "sushama":
			System.out.println("String is sushama");
		
		default:
			System.out.println("default case");
			break;
		case "Sushama":
			System.out.println("String is Sushama");
			break;	
		
		}

	}

}

