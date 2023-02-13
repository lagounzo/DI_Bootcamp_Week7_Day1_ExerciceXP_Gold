package Exercice3;

public class SingleCard {

	private int rank = 0;
	private int suit = 0;

	public SingleCard(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	

	public SingleCard() {
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
		return "SingleCard [rank=" + rank + ", suit=" + suit + "]";
	}

	
}

