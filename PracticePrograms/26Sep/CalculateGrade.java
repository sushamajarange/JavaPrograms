import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number of subjects : ");
		int n = sc.nextInt();
		
		System.out.println("Enter marks of all subjects : ");
		Integer sub[] = new Integer[n];
		for(int i = 0; i < n; i++) {
			sub[i] = sc.nextInt();
		}
		int sum = 0, total; 
		for(int j=0; j<n; j++) {
			sum = sub[j]+sum;
		}
		//System.out.println(sum);
		total = sum /n;
		if(total>60) {
			System.out.println("Your grade is : A and  marks are: "+sum+" & your percentage: "+total);
		}else if(total<60 && total>40) {
			System.out.println("Your grade is : B and  marks are: "+sum+" & your percentage: "+total);
		}else {
			System.out.println("Your grade is : C and  marks are: "+sum+" & your percentage: "+total);
		}
	}

}
