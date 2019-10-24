package euler;

public class LargestPalindromeProduct_p04 {
	
	int result;
	
	boolean found = false;
	
	LargestPalindromeProduct_p04() {
		int number = 999999;
		while (!this.found) {
			this.check(number--);
		}
	}
	
	private void check(final int i) {
		if (EulerString.isPalindrome(i)) {
			for (int j = 999; j > 99; j--) {
				if (i % j == 0 && i / j > 99 && i / j < 1000) {
					this.found = true;
					this.result = i;
				}
			}
		}
		
	}
	
	public static void main(final String[] args) {
		System.out.println(new LargestPalindromeProduct_p04().result);
		
	}
	
}
