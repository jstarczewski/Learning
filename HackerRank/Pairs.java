import java.util.*;


public class Pairs {


	static int divisibleSumPairs(int n, int k, int[] ar) {
		Arrays.sort(ar);
		int count = 0;
		if (n < 2 || n > 100)
			return -1;
		if (k < 1 || k > 100)
			return -1;
		for (int i = 0; i<n; i++) {
			if (ar[i] < 1 || ar[i] > 100)
				return -1;
			for (int j = i+1; j<n; j++) {
				if ((ar[j]+ar[i])%k==0 && i<j)
					count++;	
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = {1,3,2,6,1,2};
		System.out.println(divisibleSumPairs(arr.length, 3, arr));
	}

}
