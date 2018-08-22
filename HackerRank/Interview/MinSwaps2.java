public class MinSwaps2 {

	static int minimumSwap(int[] arr) {
		int c = 0;
		int tmp;
		int len = arr.length;
		if (arr[arr.length-1] == arr.length) {
			System.out.println("elo");
			arr[len-1]-=1;
		}
		for (int i =0; i<len; i++) {
			if (!(arr[i] == (i+1))) {
				tmp = arr[arr[i]-1];
				arr[arr[i]-1] = arr[i];
				arr[1]=tmp;
				i--;
				c++;	
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int[] q = {1,3,5,2,4,6,7};
		System.out.println(minimumSwap(q));
	}

}
