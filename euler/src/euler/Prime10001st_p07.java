package euler;

public class Prime10001st_p07 {
	
	long result;
	
	Prime10001st_p07() {
		for (int i = 0; i <= 10001; i++) {
			this.result = EulerPrime.nextPrime(this.result);
		}
	}
	
	public static void main(final String[] args) {
		System.out.println(new Prime10001st_p07().result);
		
	}
	
}
