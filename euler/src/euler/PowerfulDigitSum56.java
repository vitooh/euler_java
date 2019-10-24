package euler;

import java.math.BigInteger;

public class PowerfulDigitSum56 {
	
	public static void main(final String[] args) {
		
		int max = 0;
		
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				final int temp = sum_digits(new BigInteger(String.valueOf(i)).pow(j));
				if (temp > max) {
					max = temp;
				}
			}
		}
		
		System.out.println(max);
		
	}
	
	private static int sum_digits(final BigInteger bI) {
		
		int sum = 0;
		
		final char[] char_bi = bI.toString().toCharArray();
		
		for (final char c : char_bi) {
			sum = sum + Integer.valueOf(String.valueOf(c));
		}
		
		return sum;
	}
	
}
