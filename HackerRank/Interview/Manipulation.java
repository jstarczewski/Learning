public class Manipulation {

	static void printArr(long[] arr) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	static long arrayManipulation(int n, int[][]queries) {
		if (n < 3 || n > 10000000)
			return -1;
		if(queries.length < 1 || queries.length > 2 * 100000) 
			return -1;

		long[] arr = new long[n];
		long max = 0;
		for (int i=0; i< queries.length; i++) {
			for (int j = queries[i][0]; j<=queries[i][1]; j++) {
				if (queries[i][0] < 1 || queries[i][0] > queries[i][1] || queries[i][1] > n)
					return -1;
				if (queries[i][2] > 10000000000L || queries[i][2] < 0)
					return -1;
				arr[j-1]+=queries[i][2];
				if (arr[j-1] > max)
					max = arr[j-1];
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		int[][] q = {{1,2,100}, {2,5,100}, {3,4,100}};	
		System.out.println(arrayManipulation(5, q));	
	}

}
