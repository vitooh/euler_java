package euler;

public class EulerPrime {
	
	public static boolean isPrime(final long i) {
		if (i == 2 || i == 3 || i == 5) {
			return true;
		}
		if (i % 2 == 0) {
			return false;
		}
		for (long j = 3; j < i / j; j += 2) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(final String[] args) {
		if (isPrime(11L)) {
			System.out.println("isPrime seems to be working");
		}
		if (nextPrime(11) == 13) {
			System.out.println("nextPrime seems to be working");
		}
		if (largestPrimeFactor(13195) == 29) {
			System.out.println("largestPrimeFactor seems to be working");
		}
	}
	
	static long nextPrime(long j) {
		while (true) {
			j++;
			if (isPrime(j)) {
				return j;
			}
			
		}
	}
	
	static long largestPrimeFactor(final long a) {
		return new LargestPrimeFactor_p03(a).result;
	}
	
}
