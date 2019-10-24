package euler;

import java.math.BigInteger;

public class Ulamek57 {
	
	BigInteger l;
	
	BigInteger m;
	
	Ulamek57(final int x, final int y) {
		this.l = BigInteger.valueOf(x);
		this.m = BigInteger.valueOf(y);
	}
	
	void dodaj_jeden() {
		this.l = this.l.add(this.m);
	}
	
	void dodaj_dwa() {
		this.l = this.l.add(this.m.multiply(BigInteger.valueOf(2L)));
	}
	
	void odwroc() {
		final BigInteger temp = this.l;
		this.l = this.m;
		this.m = temp;
	}
	
	boolean check() {
		if (this.l.toString().length() > this.m.toString().length()) {
			return true;
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.l) + "/" + String.valueOf(this.m);
		
	}
	
}
