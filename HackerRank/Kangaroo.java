public class Kangaroo {
	
	static String kangaroo(int x1, int v1, int x2, int v2) {
		if ((0<= x1 && x1<x2 && x2<= 10000) && (1<= v1 && v1 <= 10000 && 1<= v2 && v2 <= 10000)  && (v2<v1 && (x2-x1)%(v2-v1)==0))
			return "YES";
		else
			return "NO";
	}

	public static void main(String[] args) {
		System.out.println(kangaroo(Integer.valueOf(args[0]), Integer.valueOf(args[1]), Integer.valueOf(args[2]),Integer.valueOf(args[3])));


//		8, 4 | 11, 6 | 14, 8, 
	}

}
