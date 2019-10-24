package euler;

public class Multiplesof3and5_p01 {
	
	long result;
	
	Multiplesof3and5_p01(int n) {
		long result = 0;
		for (int i = 3; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}
		this.result = result;
	}
	
	
}
