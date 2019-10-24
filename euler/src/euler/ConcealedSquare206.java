package euler;

public class ConcealedSquare206 {
	
	public static void main(final String[] args) {
		
		for (long i = 1010101010L; i < 1389026624L; i = next_number_producer(i)) {
			if (check(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	private static boolean check(final long i) {
		final long l = i * i;
		final String number = String.valueOf(l);
		if (number.charAt(0) == "1".charAt(0)) {
			if (number.charAt(2) == "2".charAt(0)) {
				if (number.charAt(4) == "3".charAt(0)) {
					if (number.charAt(6) == "4".charAt(0)) {
						if (number.charAt(8) == "5".charAt(0)) {
							if (number.charAt(10) == "6".charAt(0)) {
								if (number.charAt(12) == "7".charAt(0)) {
									if (number.charAt(14) == "8".charAt(0)) {
										System.out.println(number + " " + i);
									}
								}
							}
						}
					}
				}
			}
		}
		
		return false;
	}
	
	private static long next_number_producer(long l) {
		l++;
		if (l % 100 <= 30) {
			return l / 100 * 100 + 30;
		}
		else if (l % 100 <= 70) {
			return l / 100 * 100 + 70;
		}
		return l / 100 * 100 + 130;
	}
	
}
