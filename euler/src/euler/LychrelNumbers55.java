package euler;

import java.math.BigInteger;

public class LychrelNumbers55 {
	
	public static void main(final String[] args) {
		int counter = 0;
		for (int i = 10; i < 10000; i++) {
			if (make_palindrom(new BigInteger(String.valueOf(i))) == "Lychrel") {
				counter++;
			}
		}
		
		System.out.println(counter);
		System.out.println(new BigInteger("4994"));
		
	}
	
	private static String make_palindrom(final BigInteger i) {
		return make_palindrom(i, 0);
	}
	
	private static String make_palindrom(final BigInteger i, final int level) {
		
		if ((is_palindrom(i) || level > 50) && level > 0) {
			return is_palindrom(i) ? i + " " + level : "Lychrel";
			
		}
		
		final char[] array_i = String.valueOf(i).toCharArray();
		final char[] reverse_i = new char[array_i.length];
		for (int j = 1; j <= array_i.length; j++) {
			reverse_i[array_i.length - j] = array_i[j - 1];
		}
		
		final BigInteger new_i = i.add(new BigInteger(String.valueOf(reverse_i)));
		
		return String.valueOf(make_palindrom(new_i, level + 1));
		
	}
	
	private static boolean is_palindrom(final BigInteger i) {
		
		final char[] array_i = String.valueOf(i).toCharArray();
		for (int j = 0; j < array_i.length; j++) {
			if (array_i[j] != array_i[array_i.length - 1 - j]) {
				return false;
			}
		}
		
		return true;
	}
}
