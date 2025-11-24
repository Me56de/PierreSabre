package histoire;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnnaissance=0;
	protected Humain[] memoire; 
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		this.memoire = new Humain[3];
	}
	
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public void setArgent(int argent) {
		this.argent = argent;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ")" + "- " + texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien,int prix) {
		if (prix < argent) {
			parler( "J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien  + " à " + prix + " sous. ");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien  + " à " + prix + " sous. ");
		}
	}
	
	protected int gagnerArgent(int gain) {
		return argent = argent + gain ;
	}
	
	protected int perdreArgent(int perte) {
		return argent = argent - perte;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		autreHumain.direBonjour();
		repondre(autreHumain);
		memoriser(autreHumain);
	}
	
	private void repondre(Humain autreHumain) {
		direBonjour();
		autreHumain.memoriser(this);
		
	}
	
	private void memoriser(Humain autreHumain) {
		if (nbConnnaissance<3) {
			memoire[nbConnnaissance]=autreHumain;
			nbConnnaissance++;
		}
	}
	public void listerConnaissance() {
		String texte = "";
		texte = texte + "Je connais beaucoup de monde dont : ";
		for (int i=0;i<nbConnnaissance-1;i++) {
			texte = texte + memoire[i].getNom() + ", ";
		}
		texte = texte + memoire[nbConnnaissance-1].getNom();
		parler(texte);
	}
}
