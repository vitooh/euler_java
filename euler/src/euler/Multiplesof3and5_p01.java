package euler;

public class Multiplesof3and5_p01 {
	
	static int max = 1000;
	
	Multiplesof3and5_p01() {
		long result = 0;
		for (int i = 3; i < max; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}
		System.out.println(result);
	}
	
	public static void main(final String[] args) {
		
		new Multiplesof3and5_p01();
		
	}
	
}
