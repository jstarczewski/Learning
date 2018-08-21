public class Chaos {


	public static void minimumBribes(int[] q) {
		int tmp;
		int distance = 2;
		boolean chaotic = false;
		int i = q.length-1;
		int movesMade = 0;
		if (q.length < 100000 && q.length > 0) {
		while (i>0) {
			distance = 0;
			while(q[i-1] > q[i] && i < q[i-1]) {
				tmp = q[i];
				q[i] = q[i-1];
				q[i-1] = tmp;
				distance++;
				movesMade++;
				if (i<q.length-1)
				i++;
			}
			if (distance > 2)
				chaotic = true;
			i--;
		}	

		if (!chaotic)
			System.out.println("-> "+movesMade);
		else {
			System.out.println("Too chaotic");
		}
		}
	}

	public static void main(String[] args) {
		int[] q = {5,1,2,3,7,8,6,4};


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
		minimumBribes(q);
		for (int i = 0; i<q.length; i++) {
			System.out.println(q[i]);
		}
	
	}

}
