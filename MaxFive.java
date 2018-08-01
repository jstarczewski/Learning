import java.util.Random;




class MaxFive {

	static void minMax(int[] arr) {
		int sum = 0;
		int min = arr[0];
		int max = arr[0]; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];	
			}
			if (arr[i]>max) {
				max = arr[i];
			}
			sum+=arr[i];
		}
		System.out.println("min "+ (sum-max) + " max " + (sum-min));
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random r= new Random();
		for (int i = 0; i<5; i++) {
			arr[i] = r.nextInt(100);
			System.out.println("" + arr[i]);
		}
		minMax(arr);
	}
}
