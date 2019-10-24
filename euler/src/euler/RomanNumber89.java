package euler;

public class RomanNumber89 {
	
	String Roman;
	
	static char[] validLetters = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	
	int value;
	
	RomanNumber89() {
		
	}
	
	void setRoman(final String roman) {
		this.Roman = roman;
	}
	
	void setValue(final int number) {
		this.value = number;
	}
	
	void setValueFromRoman() {
		
		for (final char letter : this.Roman.toCharArray()) {
			
		}
		
	}
}
