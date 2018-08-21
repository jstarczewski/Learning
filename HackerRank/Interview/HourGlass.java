public class HourGlass {

	static int hourglassSum(int[][] arr) {
		int sum = 0;
		int max = -70;
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				if (arr[i][j] < -9 || arr[i][j] > 9 ) 
						return -1;
				if (i != 0 && i != 5 && j != 0 && j!=5) {
					sum = arr[i][j]+arr[i-1][j]+arr[i-1][j-1]+arr[i-1][j+1] + arr[i+1][j]+arr[i+1][j+1] + arr[i+1][j-1];	
					if (sum > max) {
						max = sum;
					}
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] arr = {{-9, -9, -9, 1, 1, 1}, 
				{0, -9, 0, 4, 3, 2},
				{-9, -9, -9, 1, 2, 3},
				{0, 0, 8, 6, 6, 0},
				{0, 0, 0, -2, 0, 0},
				{0, 0, 1, 2, 4, 0}
				};
	
		System.out.println(hourglassSum(arr));
	}

}
