package euler;

public class LargestPrimeFactor_p03 {
	
	long result;
	
	public LargestPrimeFactor_p03(long i) {
		while (!EulerPrime.isPrime(i)) {
			long j = 2;
			while (i % j != 0) {
				j = EulerPrime.nextPrime(j);
			}
			i = i / j;
		}
		
		this.result = i;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.result);
	}
	
	public static void main(final String[] args) {
		
		System.out.println(new LargestPrimeFactor_p03(13195));
		System.out.println(new LargestPrimeFactor_p03(600851475143L));
		
	}
	
}
