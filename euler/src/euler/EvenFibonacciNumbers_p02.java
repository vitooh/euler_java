package euler;

import java.math.BigInteger;

public class EvenFibonacciNumbers_p02 {
	
	public static void main(final String[] args) {
		BigInteger result = BigInteger.ZERO;
		BigInteger currentFibo = BigInteger.ONE;
		BigInteger previousFibo = BigInteger.ONE;
		while (currentFibo.compareTo(BigInteger.valueOf(4000000L)) <= 0) {
			if (currentFibo.mod(BigInteger.valueOf(2L)) == BigInteger.ZERO) {
				result = result.add(currentFibo);
			}
			final BigInteger temp = currentFibo;
			currentFibo = nextFibo(previousFibo, currentFibo);
			previousFibo = temp;
		}
		System.out.print(result);
	}
	
	static BigInteger nextFibo(final BigInteger previousFibo, final BigInteger currentFibo) {
		if (currentFibo.equals(BigInteger.valueOf(1L))) {
			return BigInteger.valueOf(2L);
		}
		return previousFibo.add(currentFibo);
		
	}
	
}
