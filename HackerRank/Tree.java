public class Tree {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int appleCount =0;
		int orangeCount = 0;
		if ( (1<=s && 1<=t && 1 <= a && 1<= b && 1<=apples.length && 1<=oranges.length && 
					s<= 1000000 && t<= 1000000 && a<=100000 && b<= 100000 && apples.length <= 100000 && oranges.length <= 1000000)
			 &&(a < s && s < t && t < b) ) {
			for (int i = 0; i<apples.length; i++) {
				if (apples[i] < 100000 && apples[i] > -100000 &&
					       	s<=(a+apples[i]) && (a+apples[i])<=t)
					appleCount++;
			}	
			System.out.println(""+appleCount);
			for (int i = 0; i<oranges.length; i++) {
				if (oranges[i] < 100000 && oranges[i] > -100000 &&
					       	s<=(b-oranges[i]) && (b+oranges[i])<=t)
					orangeCount++;
			}
			System.out.println(""+orangeCount);
		}
	
	}
	static void countAll(int s, int t, int a int b, int[] apples, int[] oranges) {
		
	}


	public static void main(String[] args) {
		int[] apples = {-2, 2,1};
		int[] oranges = {5, -6};
		countApplesAndOranges(7,11,5,15, apples, oranges);
			
	}

}
