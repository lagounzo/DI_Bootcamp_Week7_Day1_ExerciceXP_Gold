/**
 * @author N'ZO LAGOU
 * 
 * Exercice 2 : Jeu Complet De Cartes

Écrivez une classe dont les instances représentent un jeu complet de cartes.
Basé sur la classe de cartes de l'exercice précédent.
 */



package exercice2;

public class Card {
	
	// creat attribut
	
	private int valeur;
	private String type;
	private String name;
	

	// constructor without parameter
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

// constructor with parameter
	public Card(int valeur, String type, String name) {
		super();
		this.valeur = valeur;
		this.type = type;
		this.name = name;
	}

	// setter and getter
	
	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Card [valeur=" + valeur + ", type=" + type + ", name=" + name + "]";
	}
	
	
	
}
