package euler;

public class SpecialPythagoreanTriplet_p09 {
	
	long result = 1;
	
	int[] triplet = new int[3];
	
	SpecialPythagoreanTriplet_p09() {
		this.findtriplet();
		this.countresult();
	}
	
	private void findtriplet() {
		for (int i = 1; i <= 1000; i++) {
			for (int j = i + 1; j <= 1000; j++) {
				for (int k = j + 1; k < 1000; k++) {
					if (i + j + k == 1000 && i * i + j * j == k * k) {
						this.triplet[0] = i;
						this.triplet[1] = j;
						this.triplet[2] = k;
						return;
						
					}
				}
			}
		}
		
	}
	
	private void countresult() {
		for (final int i : this.triplet) {
			this.result *= i;
		}
		
	}
	
}
