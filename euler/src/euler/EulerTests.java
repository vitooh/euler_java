package euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EulerTests {
	
	@Test
	public void testP01() {
		assertEquals(23, new Multiplesof3and5_p01(10).result);
		assertEquals(233168, new Multiplesof3and5_p01(1000).result);
	}
	
	@Test
	public void testP03() {
		assertEquals(29, new LargestPrimeFactor_p03(13195).result);
		assertEquals(6857, new LargestPrimeFactor_p03(600851475143L).result);
	}
	
	@Test
	public void testP04() {
		assertEquals(906609, new LargestPalindromeProduct_p04().result);
	}
	
	@Test
	public void testP05() {
		assertEquals(2520, new SmallestMultiple_p05(10).result);
		assertEquals(232792560, new SmallestMultiple_p05(20).result);
	}
	
	@Test
	public void testP06() {
		final SumSquareDifference_p06 test10 = new SumSquareDifference_p06(10);
		assertEquals(2640, test10.squareOfSums - test10.sumOfSqares);
		final SumSquareDifference_p06 test100 = new SumSquareDifference_p06(100);
		assertEquals(25164150, test100.squareOfSums - test100.sumOfSqares);
	}
	
	@Test
	public void testP07() {
		assertEquals(104743, new Prime10001st_p07().result);
	}
	
	@Test
	public void testP08() {
		assertEquals(23514624000L, new LargestProductInASeries_p08(13).result);
	}
	
	@Test
	public void testP09() {
		assertEquals(31875000, new SpecialPythagoreanTriplet_p09().result);
	}
	
	@Test
	public void testP10() {
		assertEquals(17, new SummationOfPrimes_p10(10).result);
		assertEquals(142913828922L, new SummationOfPrimes_p10(2000000).result);
	}
	
	@Test
	public void testP55() {
		final LychrelNumbers55 test = new LychrelNumbers55();
		final String[] args = null;
		LychrelNumbers55.main(args);
		assertEquals(249, LychrelNumbers55.result);
	}
	
	@SuppressWarnings("boxing")
	@Test
	public void testEulerPrime() {
		assertEquals(true, EulerPrime.isPrime(11L));
		assertEquals(true, EulerPrime.nextPrime(11) == 13);
		assertEquals(true, EulerPrime.largestPrimeFactor(13195) == 29);
		System.out.println(EulerPrime.isPrime(227));
	}
	
	@Test
	public void testEulerString() {
		
	}
	
}
