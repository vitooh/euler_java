package euler;

public class XORDecryption {
	
	public static void main(final String[] args) {
		
		System.out.print(XOR(65));
		
	}
	
	private static String XOR(final int i) {
		final String temp = Integer.toBinaryString(i);
		final int l = 8 - temp.length();
		return "0";
	}
	
}
