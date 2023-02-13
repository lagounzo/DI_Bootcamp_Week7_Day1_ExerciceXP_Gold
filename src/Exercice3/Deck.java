/**
 * @author N'ZO LAGOU
 * Exercice 3 : Classe De Carte À Jouer Simple

Écrivez une classe dont les instances représentent une seule carte à jouer d'un jeu de cartes.

Les cartes à jouer ont deux propriétés distinctes : ranket suit.
 */


package Exercice3;

public class Deck {
	
	

    // Kinds of suits
    public final static int DIAMONDS = 1;
    public final static int CLUBS    = 2;
    public final static int HEARTS   = 3;
    public final static int SPADES   = 4;

    // Kinds of ranks
    public final static int ACE   = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR  = 4;
    public final static int FIVE  = 5;
    public final static int SIX   = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE  = 9;
    public final static int TEN   = 10;
    public final static int JACK  = 11;
    public final static int QUEEN = 12;
    public final static int KING  = 13;

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleCard card = new SingleCard(SEVEN, KING);
		System.out.println(card.toString());
	}
}
