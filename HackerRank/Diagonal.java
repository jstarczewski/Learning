import java.util.Random;

public class Diagonal {

	static int diagonalDifference(int arr[][]) {
		int a = 0;
		int b = 0;
		for (int i = 0; i<3; i++) {
			for (int m = 0; m<3; m++) {

			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Random ran = new Random();
		int[][] diag = new int[3][3];
		for (int i = 0; i<3; i++) {
			for (int m = 0; m<3; m++) {
				diag[i][m] = ran.nextInt(30); 
			}
		}
		for (int i = 0; i<3; i++) {
			System.out.println("\n");
			for (int m = 0; m<3; m++) {
				System.out.println(""+diag[i][m]);
			}
		}
	}


}
