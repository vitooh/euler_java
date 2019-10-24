package euler;

public class SmallestMultiple_p05 {
	
	long result;
	
	public SmallestMultiple_p05(final long i) {
		long n = 11;
		while (!this.check(n++, i)) {
			;
		}
	}
	
	private boolean check(final long n, final long i) {
		for (long j = 2; j <= i; j++) {
			if (n % j != 0) {
				return false;
			}
		}
		this.result = n;
		return true;
	}
	
	public static void main(final String[] args) {
		System.out.println(new SmallestMultiple_p05(20).result);
		
	}
	
}
