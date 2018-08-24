public class Manipulation {

	static void printArr(long[] arr) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	static long arrayManipulation(int n, int[][] queries) {
		if (n < 3 || n > 10000000)
			return -1;
		if(queries.length < 1 || queries.length > 2 * 100000) 
			return -1;

		long[] arr = new long[n];
		long max = 0;
		long temp =0;
		for (int i=0; i< queries.length; i++) {
				arr[queries[i][0]-1]+=queries[i][2];
				if (queries[i][1] < n) 
					arr[queries[i][1]]-=queries[i][2];
		}
		for (int i = 0; i<n; i++) {
			temp += arr[i];
			if (temp > max)
				max = temp;

		}
		
		return max;
	}
	static long arrayManipulationTwo(int n, int[][]queries) {
		if (n < 3 || n > 10000000)
			return -1;
		if(queries.length < 1 || queries.length > 2 * 100000) 
			return -1;

		long[] arr = new long[n];
		for (int i=0; i< queries.length; i++) {
				arr[queries[i][0]-1]+=queries[i][2];
				if (queries[i][1] < queries.length) 
					arr[queries[i][1]]-=queries[i][2];
		}
		long temp =0;
		long max =0;
		for (int i = 0; i<queries.length; i++) {
			temp += arr[i];
			if (temp > max)
				max = temp;

		}
		
		return max;
	}

	/// int sum place where pair meet - > if new pairs -



	public static void main(String[] args) {
		int[][] q = {{1,5,3}, {4,8,7}, {6,9,1}};	
		System.out.println(arrayManipulation(10, q));	
	}

}
