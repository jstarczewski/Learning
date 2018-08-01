public class prime {
	public static void main(String[] args) {
		System.out.println(isPrime(3));
		System.out.println(isPrime(10));
		System.out.println(isPrime(1));
		System.out.println(isPrime(-1));
		System.out.println(isPrime2));
		System.out.println(isPrime(13));
		System.out.println(isPrime(100));
		System.out.println(isPrime(213213231));
	}	
	public static boolean isPrime(int n) {
		if (n < 2) 
			return false;
		for (int i = 2; i < n/2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

} 
