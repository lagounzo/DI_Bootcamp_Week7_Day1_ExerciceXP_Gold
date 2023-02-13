package exercice1;

public class Shape {

	//attibut protected
	protected  double largeur;
	protected  double hauteur;

	// constructeur sans paramettre
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	// constructeur sans paramettre
	public Shape(double largeur, double hauteur) {
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

//setter getter
	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	// class methode
	
	public double getAera() {
		
		return hauteur*largeur;
	}
	
}
