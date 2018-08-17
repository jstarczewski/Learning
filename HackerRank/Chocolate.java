import java.util.*;

public class Chocolate {

	static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		int ways = 0;
	    for (int i = m; i<s.size(); i++) {
	    	count = 0;
	    	for (int j = 0; j<m; j++) {
	    		count+=s.get(i-j);
			}
			if (count==d)
				ways++;
        }

		return ways;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		System.out.println(" ways " + birthday(list, 3, 2));

	
	}
}
