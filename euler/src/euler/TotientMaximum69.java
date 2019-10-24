package euler;

import java.util.ArrayList;
import java.util.List;

public class TotientMaximum69 {
	
	public static void main(final String[] args) {
		for (int i = 2; i < 11; i++) {
			System.out.print(i + " ");
			relativePrimes(i);
		}
	}
	
	private static void relativePrimes(final int i) {
		final List<Integer> not_primes = new ArrayList<>();
		for (int j = 1; j < i; j++) {
			if (i % j != 0) {
				boolean relative_prime = false;
				for (final int k : not_primes) {
					if (i % k != 0) {
						System.out.print(j + ",");
					}
					relative_prime = true;
				}
			}
			else {
				not_primes.add(j);
				System.out.println(j + ":");
			}
		}
		System.out.println();
	}
	
}
