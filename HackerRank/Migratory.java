import java.util.*;

public class Migratory {

	static int migratoryBirds(List<Integer> arr) {
		if (arr.size() < 5 && arr.size() > 2* 100000)
			return -1;
		int[] birds = new int[arr.size()];
		for(Integer i : arr) {
			if (i != 1 && i!= 2 && i!=3 && i!=4 && i!=5)
				return -1;
			birds[i]++;
		}
		int max = birds[0];
		int maxIndex = 0;
		for(int i = 0; i<birds.length; i++) {
			if (birds[i]>max) {
				max = birds[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}	

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(3);
		System.out.println(migratoryBirds(list));
	}

}
