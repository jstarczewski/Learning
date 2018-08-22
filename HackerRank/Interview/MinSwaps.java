public class MinSwaps {
	
	static void printArr(int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " "); 
		}
		System.out.println();
	}

	public static int minimumBribes(int[] arr) {
		int len = 0;
		if (arr.length > 100000)
			return -1;
		len = (arr.length/2);
		int j = len;
		int i = 0;
		int tooSmall = 0;
		int tooBig =0;
		int tmp;
		boolean isFoundSmall = true;
		boolean isFoundBig = true;
		int minSwaps= 0;
		while (isFoundBig && isFoundSmall) {
			if (arr[i]>arr.length || arr[j] > arr.length) {
				return -1;
			}
				if (arr[i] > len) {
					tooBig = arr[i];
					isFoundBig = true;
				}
				else {
					isFoundBig = false;
				}
				if (arr[j] <= len) {
					tooSmall = arr[j];
					isFoundSmall = true;
				}
				else {
					isFoundSmall = false;
				}
				if (isFoundBig && isFoundSmall) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					minSwaps++;
				}
				i++;
				if (j+1!=arr.length)
					j++;
		}
		int a =0;
		while(a<arr.length-1) {
			if (arr[a] > arr.length)
				return -1;
			if (arr[a] > arr[a+1]) {
				tmp = arr[a];
				arr[a] = arr[a+1];
				arr[a+1] = tmp;
				minSwaps++;
				a=0;
			}
			else {
			a++;
			}
		}
		return minSwaps;
	}

	public static void main(String[] args) {
	//
//	int[] arr = {7,1,3,2,4,5,6};
//	int[] arr = {4,3,1,2;
	int[] arr = {2,3,4,1,5};
	// 23415
	// 23145
	// 21345
	// 12345
	//	int[] arr = {1,3,5,2,4,6,7};

	//4312
	//1342
	//1243
	//1234
		// 23415
		// 21435
		// 21345
		// 12345
		//
		// -----
		// 1352|468
		// 1342|568
		// 1324|568
		// 1234|568
		// 1352468

		// find movesMade - > do permutation to on on the left
		// do other permutation if needed 
		// minimalize movesMade -> do permutation if needed
		// mini -> -> -> 
		// (count permutation to se whether more than two)

		// 1253786|4
		// 125378|64
		// 1253768|4
		// 1253764|8
		// 125376|48
		// 1253746|8
		// 125374|68
		// 12537468
		// 12534678
		// 12354678
		// 12345678
		// Sy
		//
		
		System.out.println(" swaps -> " + minimumBribes(arr));

		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
