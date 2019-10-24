package euler;

public class LargeNonMersennePrime97 {
	
	public static void main(final String[] args) {
		
		final int[] lastTenDigits = new int[10];
		
		for (int i = 0; i < 10; i++) {
			lastTenDigits[i] = 0;
		}
		
		lastTenDigits[9] = 2;
		
		for (int i = 0; i < 10; i++) {
			multiply(lastTenDigits, 2);
		}
		
		for (final int i : lastTenDigits) {
			System.out.print(i);
		}
		
	}
	
	private static void multiply(final int[] lastTenDigits, final int i) {
		
		int rest = 0;
		
		for (int j = 9; j > 0; j--) {
			final int digit = lastTenDigits[j];
			final int k = digit * i;
			lastTenDigits[j] = k % 10;
			rest = k / 10;
			if (j < 9) {
				
			}
		}
		
	}
	
}
