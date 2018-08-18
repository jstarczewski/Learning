import java.util.*;

public class Migratory {

	static int migratoryBirds(List<Integer> arr) {
		Collections.sort(arr);
		int count = 0;
		int max = 0;
		int max2 = 0;
		int count2 = 0;
		for (int i = 1; i<arr.size(); i++) {
			count++;
			if (arr.get(i)!=arr.get(i-1) && count >= count2 && arr.get(i) <= arr.get(i-1)) {
				count2=count;
				count=0;
				max = arr.get(i-1);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		System.out.println(migratoryBirds(list));
	}

}
