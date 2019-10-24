package euler;

public class SummationOfPrimes_p10 {
	
	long result;
	
	SummationOfPrimes_p10(final int n) {
		long next = EulerPrime.nextPrime(1);
		while (next < n) {
			this.result += next;
			next = EulerPrime.nextPrime(next);
		}
	}
	
}
