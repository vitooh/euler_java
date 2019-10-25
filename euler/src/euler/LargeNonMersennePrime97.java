package euler;

public class LargeNonMersennePrime97 {
	
	String result;
	
	LargeNonMersennePrime97() {
		
		final int[] lastTenDigits = new int[10];
		
		for (int i = 0; i < 10; i++) {
			lastTenDigits[i] = 0;
		}
		
		lastTenDigits[9] = 2;
		final int power = 7830457;
		
		for (int i = 0; i < power; i++) {
			multiply(lastTenDigits, 2);
		}
		
		multiply(lastTenDigits, 28433);
		
		for (final int i : lastTenDigits) {
			System.out.print(i + " ");
		}
		
	}
	
	private static void multiply(final int[] lastTenDigits, final int i) {
		
		int rest = 0;
		
		for (int j = 9; j > 0; j--) {
			final int digit = lastTenDigits[j];
			final int k = digit * i;
			lastTenDigits[j] = k % 10 + rest;
			rest = k / 10;
			if (j < 0) {
				
			}
		}
	}
	
	public static void main(final String[] args) {
		new LargeNonMersennePrime97();
	}
	
}
