/**
 * @author N'ZO LAGOU
 * Exercice 1 : La Classe Shape
Instructions
Créez une Shapeclasse de base avec :

champs protégés en largeur et en hauteur,

méthodes getter et setter pour ces champs,

une méthode pour calculer la surface de la forme.

Les classes Rectangleet Squareétendent la classe Shape 
et ont leurs propres constructeurs qui appellent le constructeur de la superclasse.

La Rectangleclasse remplace également la getArea()méthode pour calculer correctement 
l'aire d'un rectangle.

La méthode principale crée des instances des classes et et imprime leurs aires 
Rectangle.Square
 */


package exercice1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle rect = new Rectangle(4,5);
Square square1 = new Square(7,5);
System.out.println("le resultat des calcules de largeur" + square1.getAera() );
System.out.println("le resultat des calcules de hauteur" + rect.getAera() );
	}

}
