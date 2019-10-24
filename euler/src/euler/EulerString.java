package euler;

import java.math.BigInteger;

public class EulerString {
	
	public static void main(final String[] args) {
		final String pal = "SOS";
		if (isPalindrome(pal)) {
			System.out.println("isPalindrome(String): " + pal + " OK");
		}
		final String noPal = "SO1S";
		if (!isPalindrome(noPal)) {
			System.out.println("isPalindrome(String): " + noPal + " OK");
		}
		final int o = 12321;
		if (isPalindrome(o)) {
			System.out.println("isPalindrome(long): " + o + " OK");
		}
		
	}
	
	public static boolean isPalindrome(final long a) {
		return isPalindrome(String.valueOf(a));
	}
	
	private static boolean isPalindrome(final String a) {
		for (int i = 0; i <= a.length() / 2; i++) {
			if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome(final BigInteger i) {
		return isPalindrome(String.valueOf(i));
	}
	
}
