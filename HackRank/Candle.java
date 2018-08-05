import java.util.Random;
public class Candle {

	static int maxCandle(int[] ar) {
		int max = ar[0];
		int amount = 0;
		for (int i = 0; i<ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
				amount = 1;
			}	
			else if (ar[i] == max) {
				amount++;
			}
		
		}
		return amount;
	}

	public static void main(String[] args) {
		int[] ar = {1, 1, 1, 1, 1};
		Random r = new Random();
	//	for (int i = 0; i<ar.length; i++) {
	//		ar[i] = r.nextInt(10);
	//		System.out.println(""+ar[i]);
	//	}
	//
		System.out.println("Swieczki " + maxCandle(ar));
			
	}

}
