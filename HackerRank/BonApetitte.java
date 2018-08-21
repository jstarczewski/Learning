import java.util.*;
public class BonApetitte {

	static void bonAppetit(List<Integer>bill, int k, int b) {
		int sum = 0;
		if (2 <= bill.size() && bill.size() <= 100000 && k >= 0 && k <= bill.size()) {
			for (int i = 0; i<bill.size(); i++) {
				if (!(i==k) && bill.get(i) >= 0 && bill.get(i) <= 10000)
					sum +=bill.get(i);
			}	
			if (b >= 0 && sum >= b) {
				if (b == sum/2) {
					System.out.println("Bon Appetit");
				}
				else {
					System.out.println(b - sum/2);
				}		
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(10);
		list.add(2);
		list.add(9);
		bonAppetit(list, 1, 7);
	}

}
