public class Tree {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int appleCount =0;
		int orangeCount = 0;
		int max = 100000;
		if (a<s && s<t && t< b && s>= 1 && t>= 1 && a >= 1 && b >= 1 && apples.length >= 1 && oranges.length >= 1 &&
				s<= max && t<=max && a <= max && b <= max && apples.length <= max && oranges.length <= max ) {
			for (int i = 0; i<apples.length; i++) {
				if(apples[i] >= -max && apples[i] <= max && s<=(a+apples[i]) && (a+apples[i])<=t)
					appleCount++;
			}	
			System.out.println(appleCount);
			for (int i = 0; i<oranges.length; i++) {
				if(oranges[i] >= -max && oranges[i] <= max && s<=(b+oranges[i]) && (b+oranges[i])<=t)
					orangeCount++;
			}
			System.out.println(orangeCount);
		
		}
	}


	public static void main(String[] args) {
		int[] apples = {-2, 2,1};
		int[] oranges = {5, -6};
		countApplesAndOranges(7,11,5,15, apples, oranges);
			
	}

}
