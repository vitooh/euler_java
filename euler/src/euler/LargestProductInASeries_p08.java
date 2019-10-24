package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargestProductInASeries_p08 {
	
	long result = 0;
	
	String theBigNumber;
	
	public LargestProductInASeries_p08(final int i) {
		this.getTokensFromFile();
		//this.printBigNumber();
		this.findResult(i);
		
	}
	
	private void findResult(final int l) {
		for (int i = 0; i <= this.theBigNumber.length() - l; i++) {
			long temp = 1;
			for (int j = 0; j < l; j++) {
				temp *= Long.parseLong(this.theBigNumber.substring(i + j, i + j + 1));
			}
			if (this.result < temp) {
				this.result = temp;
				
			}
			
		}
		
	}
	
	private void getTokensFromFile() {
		File file = new File("./euler/src/euler/1000digints_p08.txt");
		try {
			
			Scanner sc = new Scanner(file);
			
			final StringBuilder theBigNumberBuilder = new StringBuilder();
			while (sc.hasNext()) {
				theBigNumberBuilder.append(sc.next());
			}
			this.theBigNumber = theBigNumberBuilder.toString();
		}
		catch (final FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	private void printBigNumber() {
		System.out.println(this.theBigNumber);
		
	}
	
	public static void main(final String[] args) {
		System.out.println(new LargestProductInASeries_p08(13).result);
		
	}
	
}
