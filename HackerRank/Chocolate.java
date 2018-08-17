import java.util.*;

public class Chocolate {

	static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		int ways = 0;
		if (s.size()>100 || 1 > d || 1 > m || d > 31 || m > 12)
			return -1;
		if (s.size()==1)
			if (s.get(0)==d)
				return 1;
	    for (int i = m-1; i<s.size(); i++) {
	    	count = 0;
	    	for (int j = 0; j<m; j++) {
	    	    if (s.get(i-j) > 5 || s.get(i-1) < 1)
	    	    	return -1;
	    		count+=s.get(i-j);
			}
			if (count==d)
				ways++;
        }

		return ways;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
	//	list.add(2);
	//	list.add(1);
	//	list.add(3);
	//	list.add(2);
		System.out.println(" ways " + birthday(list, 4, 1));

	
	}
}
