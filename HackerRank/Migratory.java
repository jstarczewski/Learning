import java.util.*;

public class Migratory {

	static int migratoryBirds(List<Integer> arr) {
		Collections.sort(arr);
		int count = 0;
		int max = 0;
		int[] ar = new int[arr.size()];
		for (int i = 1; i<arr.size(); i++) {
		}
		return 0;
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
