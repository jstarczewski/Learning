public class Record {

	static int[] breakingRecords(int[] scores) {
		int[] records = {0,0};
		int min = scores[0];
		int max = scores[0];
		if (scores.length < 1 || scores.length > 1000) {
			return records;	
		}
		for (int i = 0; i<scores.length; i++) {
			if (scores[i] <0 || scores[i] > 100000000) {
				records[0] = 0;
				records[1] = 0;
				return records;
			}
			if (scores[i] > max) {
				records[0]++;
				max = scores[i];
			}
			if (scores[i] < min) {
				records[1]++;
				min = scores[i];
			}
		}
		return records;
	}


	public static void main(String[] args) {
		int scores[] = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		int[] a = breakingRecords(scores);
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
