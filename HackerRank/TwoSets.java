public class TwoSets {

	static int getTotalX(int[] a, int[] b) {
		int c = 0;
		int temp = 0;
		boolean firstCon = false;
		boolean secondCon = false;
		if (1>b.length || 1>a.length || a.length > 10 || b.length > 10 )
			return 0;
		for (int i = a[0]; i <= b[0]; i++) {
			firstCon = true;
			secondCon = false;
			for (int j = 0; j < a.length; j++) {
				if (a[j] < 1 || a[j] > 100)
					return 0;
				if (i%a[j]!=0) {
					firstCon = false;
				}
			}
			if (firstCon) {
				secondCon = true;
				for (int z = 0; z<b.length; z++) {
					if (b[z] < 1 || b[z] > 100)
						return 0;
					if (b[z]%i!=0)
						secondCon = false;
				}
			}
			if (secondCon)
				c++;
		}	
		return c;

	}

	public static void main(String[] args) {
		int[] a = {2,4};
		int[] b = {16,32,96};
		System.out.println(getTotalX(a,b));
	}

}
