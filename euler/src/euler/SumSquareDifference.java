package euler;

public class SumSquareDifference {
	
	long sumOfSqares;
	
	long squareOfSums;
	
	@Override
	public String toString() {
		return this.squareOfSums + " - " + this.sumOfSqares + " = " + (this.squareOfSums - this.sumOfSqares);
	}
	
	public SumSquareDifference(final int i) {
		long sum = 0;
		for (int j = 1; j <= i; j++) {
			sum += j;
			this.sumOfSqares += j * j;
		}
		this.squareOfSums = sum * sum;
	}
	
	public static void main(final String[] args) {
		System.out.println(new SumSquareDifference(10));
		System.out.println(new SumSquareDifference(100));
		
	}
	
}
