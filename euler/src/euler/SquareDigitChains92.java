package euler;

public class SquareDigitChains92 {
	
	public static void main(final String[] args) {
		long counter = 0;
		
		for (long i = 1; i < 10000000; i++) {
			if (EndSqareDigitValue(i) == 89) {
				counter++;
			}
		}
		System.out.println(counter);
		
	}
	
	private static long FirstSqareDigitValue(final long i) {
		if (i < 10) {
			return (long) Math.pow(i, 2);
		}
		return FirstSqareDigitValue(i % 10) + FirstSqareDigitValue(i / 10);
	}
	
	private static long EndSqareDigitValue(final long i) {
		if (i == 1 || i == 89) {
			return i;
		}
		
		return EndSqareDigitValue(FirstSqareDigitValue(i));
		
	}
}
