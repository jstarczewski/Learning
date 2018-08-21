public class LeftRotation {
	
	static int[] rotLeft(int[] a, int d) {
		int tmp;
		if (a.length < 1 && a.length > 100000)
			return null;
		if (d < 0 || d > a.length)
			return null;
		for (int i =0; i<d; i++) {
			if (a[i] < 1 || a[i] > 1000000)
				return null;
			tmp = a[0];
			for (int j = 0; j<a.length-1; j++) {
				a[j]=a[j+1];	
			}
			a[a.length-1]=tmp;
		}
		return a;	
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		a = rotLeft(a, 4);
		for (int i =0 ; i<a.length; i++) {
			System.out.println(" = " + a[i]);

		}	

	
	}


}
