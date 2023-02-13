package exercice4;

public class Card {
	private int rank;
	private int suit;
	
	//constructor with parameter
	public Card(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	//constructor without parameter
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	
	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}
	
	
	
	
}
