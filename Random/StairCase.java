public class StairCase {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i<= n; i++) {
			for (int b= 0; b< n; b++) {
				if (n-i>b)
					System.out.print(" ");
				else
					System.out.print("#");
			}
			System.out.print("\n");
		}
	}

}
