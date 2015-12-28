public class FebonancciSeries {
	public static void main(String[] args) {
		int i,count = 10;
		int sum = 0;
		int i1=0, i2=1;	
		System.out.print(i1 + " " + i2);	// It prints 0 & 1
		for(i=0;i<=count;++i){				// This loop will terminate when count is 11
			sum = i1+i2;					 
			System.out.print(" "+sum);		// here sum is 0+1=1
			i1 = i2;						// i1=1
			i2 = sum;						// i2 = 1, when again it will in the loop that time i is 1 & sum is 3 & lly
		}
	}
}

/*  Output :
 * 0 1 1 2 3 5 8 13 21 34 55 89 144
*/