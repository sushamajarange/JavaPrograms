
public class largestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int[] arr = {12,34,54,76,56,45,34,23,76,112};
		for(int i=0; i<arr.length; i++) {
			int current = 0;
			if(arr[i]>current) {
				num = arr[i];
			}
		}
		System.out.println("Number: " + num);
	}

}
