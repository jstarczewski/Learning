public class Swaps {

	public static int swap(int[] arr) {
		int tmp;
		int c=0;
		int i = 0;
		if (arr.length>1000000)
			return -1;
		while (i<arr.length) {
			if (arr[i] < 1 || arr[i] > arr.length)
				return -1;
			if (arr[arr.length-1] > arr.length)
				arr[arr.length-1]-=1;
			if (arr[i] != i+1) {
				tmp = arr[arr[i]-1];
				arr[arr[i]-1] = arr[i];	
				arr[i] = tmp;
				c++;
			}
			else {
				i++;
			}
		}
		return c;
	
	}

	public static void main(String[] args) {
		//int[] q = {7,1,3,2,4,5,6};
		// 7 1 3 2 4 5 6
		// 6 1 3 2 4 5 7
		// 5 1 3 2 4 6 7
		// 4 1 3 2 5 6 7
		// 1 3 2 4 5 6 7
		// 1 2 3 4 5 6 7
		// -------------
	//	int[] q = {4, 3, 1, 2};
		// 2 3 1 4
		// 3 2 1 4
		// 1 2 3 4
		// -------------
		int[] q = {1, 3, 5, 2, 4, 6, 8};
		// 1 5 3 2 4 6 7
		// 1 4 3 2 5 6 7
		// 1 2 3 4 5 6 7
		System.out.println(swap(q));
	}

}
