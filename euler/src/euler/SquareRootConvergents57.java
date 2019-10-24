package euler;

public class SquareRootConvergents57 {
	
	public static void main(final String[] args) {
		int counter = 0;
		final int max = 1000;
		
		for (int i = 1; i < max; i++) {
			final Ulamek57 temp = produkuj(i);
			if (temp.check()) {
				counter++;
				//System.out.println(i + ": " + temp);
			}
			
		}
		System.out.println(counter);
		
	}
	
	private static Ulamek57 produkuj(final int n) {
		final Ulamek57 ulamek = new Ulamek57(1, 2);
		
		for (int i = 1; i < n; i++) {
			ulamek.dodaj_dwa();
			ulamek.odwroc();
		}
		
		ulamek.dodaj_jeden();
		
		return ulamek;
	}
	
}
