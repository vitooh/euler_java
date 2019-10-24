package euler;

import java.math.BigInteger;

public class PowerfulDigitCounts63 {
	
	public static void main(final String[] args) {
		
		int counter = 0;
		
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				if (String.valueOf(new BigInteger(String.valueOf(j)).pow(i)).length() == i) {
					System.out.println(j + " ^ " + i + " = " + String.valueOf(new BigInteger(String.valueOf(j)).pow(i)));
					counter++;
				}
			}
		}
		
		System.out.println(counter);
	}
	
}