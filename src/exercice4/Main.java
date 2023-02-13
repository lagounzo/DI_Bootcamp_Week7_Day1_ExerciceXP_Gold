package exercice4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		Card card0 = new Card(Deck.FOUR, Deck.DIAMONDS);
		Card card1 = new Card(Deck.ACE, Deck.JACK);
		Card card2 = new Card(Deck.KING, Deck.NINE);

		deck.addCard(card0);
		deck.addCard(card1);
		deck.addCard(card2);

		deck.displayCards();
	}

}
