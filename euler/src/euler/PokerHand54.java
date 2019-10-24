package euler;

import java.util.HashMap;
import java.util.Map;

public class PokerHand54 {
	
	private static Exception e = null;
	
	String[] cards;
	
	int level;
	
	Map<String, Character> level_info = new HashMap<>();
	
	static String[] talia = {
			"AS", "AH", "AD", "AC",
			"KS", "KH", "KD", "KC",
			"QS", "QH", "QD", "QC",
			"JS", "JH", "JD", "JC",
			"TS", "TH", "TD", "TC",
			"9S", "9H", "9D", "9C",
			"8S", "8H", "8D", "8C",
			"7S", "7H", "7D", "7C",
			"6S", "6H", "6D", "6C",
			"5S", "5H", "5D", "5C",
			"4S", "4H", "4D", "4C",
			"3S", "3H", "3D", "3C",
			"2S", "2H", "2D", "2C"
	};
	
	static final char[] order = { 'A', 'K', 'Q', 'J', 'T', '9', '8', '7', '6', '5', '4', '3', '2' };
	
	PokerHand54(final String[] cards) throws Exception {
		if (cards.length != 5) {
			throw e;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (cards[i].equals(cards[j])) {
					throw e;
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			boolean card_in_talia = false;
			for (int j = 0; j < 52; j++) {
				if (cards[i].endsWith(talia[j])) {
					card_in_talia = true;
					continue;
				}
			}
			if (card_in_talia) {
				continue;
			}
			throw e;
		}
		this.cards = cards;
		this.level = this.getLevel();
		
	}
	
	private int getLevel() {
		if (this.isRoyalFlush()) {
			return 10;
		}
		if (this.isStraightFlush()) {
			return 9;
		}
		if (this.isFourOfAKind()) {
			return 8;
		}
		if (this.isFullHouse()) {
			return 7;
		}
		if (this.isFlush()) {
			return 6;
		}
		if (this.isStraight()) {
			return 5;
		}
		if (this.is3ofKind()) {
			return 4;
		}
		if (this.is2Pairs()) {
			return 3;
		}
		if (this.isPair()) {
			return 2;
		}
		return 1;
	}
	
	private boolean isPair() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (this.cards[i].charAt(0) == this.cards[j].charAt(0) && j != i) {
					this.level_info.put("Pair", this.cards[i].charAt(0));
					return true;
					
				}
			}
		}
		return false;
	}
	
	private boolean is2Pairs() {
		char first = 'x';
		final int[] first_pair_indexes = new int[2];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (this.cards[i].charAt(0) == this.cards[j].charAt(0) && i != j) {
					if (first == 'x') {
						first = this.cards[i].charAt(0);
						first_pair_indexes[0] = i;
						first_pair_indexes[1] = j;
					}
					
					else if (!this.isFirstPair(i, j, first_pair_indexes)) {
						this.level_info.put("2Pair", this.cards[i].charAt(0));
						this.level_info.put("1Pair", this.cards[first_pair_indexes[0]].charAt(0));
						return true;
						
					}
				}
			}
		}
		return false;
	}
	
	private boolean isFirstPair(final int i, final int j, final int[] first) {
		for (final int x : first) {
			if (x == i || x == j) {
				return true;
			}
		}
		return false;
	}
	
	private boolean is3ofKind() {
		for (int i = 0; i < 5; i++) {
			int counter = 0;
			for (int j = 0; j < 5; j++) {
				if (this.cards[i].charAt(0) == this.cards[j].charAt(0)) {
					counter++;
				}
				if (counter == 3) {
					this.level_info.put("2Pair", this.cards[i].charAt(0));
					return true;
				}
			}
			
		}
		return false;
		
	}
	
	private boolean isStraight() {
		if (this.isPair()) {
			return false;
		}
		int first = 12;
		int last = 0;
		
		for (int i = 0; i < 5; i++) {
			final int index = this.get_index(this.cards[i].charAt(0), order);
			if (index > last) {
				last = index;
			}
			if (index < first) {
				first = index;
			}
		}
		if (Math.abs(first - last) > 4) {
			return false;
		}
		
		return true;
	}
	
	private int get_index(final char charAt, final char[] order) {
		for (int i = 0; i < order.length; i++) {
			if (charAt == order[i]) {
				return i;
			}
		}
		return -1;
	}
	
	private boolean isFlush() {
		final char color = this.cards[0].charAt(1);
		for (int i = 0; i < 5; i++) {
			if (this.cards[i].charAt(1) != color) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isFullHouse() {
		if (!this.is2Pairs()) {
			return false;
		}
		if (!this.is3ofKind()) {
			return false;
		}
		return true;
	}
	
	private boolean isFourOfAKind() {
		for (int i = 0; i < 5; i++) {
			int counter = 0;
			for (int j = 0; j < 5; j++) {
				if (this.cards[i].charAt(0) == this.cards[j].charAt(0)) {
					counter++;
				}
				if (counter == 4) {
					return true;
				}
			}
			
		}
		return false;
	}
	
	private boolean isStraightFlush() {
		if (!this.isFlush()) {
			return false;
		}
		if (!this.isStraight()) {
			return false;
		}
		return true;
	}
	
	private boolean isRoyalFlush() {
		if (!this.isStraightFlush()) {
			return false;
		}
		boolean has_Ace = false;
		for (int i = 0; i < 5; i++) {
			if (this.cards[i].charAt(0) == 'A') {
				has_Ace = true;
				break;
			}
		}
		return has_Ace;
	}
	
	boolean is_stronger(final PokerHand54 hand) throws Exception {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (this.cards[i].equals(hand.cards[j])) {
					throw e;
				}
				
			}
		}
		
		if (this.level >= hand.level) {
			return true;
		}
		
		return false;
		
	}
	
	void to_console() {
		System.out.print(this + " Level:" + this.level + this.level_info);
		System.out.println();
		
	}
	
	public static void main(final String[] args) throws Exception {
		final String[] hand1 = { "5H", "7S", "5C", "5S", "KD" };
		final String[] hand2 = { "2C", "TS", "8S", "8D", "TD" };
		final PokerHand54 h1 = new PokerHand54(hand1);
		final PokerHand54 h2 = new PokerHand54(hand2);
		h1.to_console();
		h2.to_console();
		System.out.println(h1.is_stronger(h2));
	}
	
}
