public class gcd{
	public static void main(String[] args) {
		System.out.println(""+ 2%1+ "   " + 1%2);
		System.out.println(ggcd(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
	public static int ggcd(int p, int q) {
		if (q == 0)
			return p;
		int r = p % q;
		return ggcd(q, r);	
	}

}
