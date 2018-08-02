public class BookChapter1Practice {
	public static void main(String[] args) {

		System.out.println(""+(0+15)/2);
		System.out.println(""+(2.0e-6 * 100000000.1));
		System.out.println(""+(true && false || true && true));
		System.out.println('b');
		System.out.println('b'+'c');
		System.out.println((char)('a'+4));
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = 9 - i;
		for (int i = 0; i < 10; i++)
			a[i] = a[a[i]];
		for (int i = 0; i < 10; i++)
			System.out.println(""+a[i]);
	}

}
