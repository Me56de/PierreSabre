package histoire;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
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


	public String parler() {
		return "(" + nom + ")" + "-";
	}
	public void direBonjour() {
		System.out.println(parler() + "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
	}
	
	public void boire() {
		System.out.println(parler() + "Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien,int prix) {
		if (prix < argent) {
			System.out.println(parler() + "J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien  + " à " + prix + " sous. ");
			perdreArgent(prix);
		}
		else {
			System.out.println(parler() + "Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien  + " à " + prix + " sous. ");
		}
	}
	
	protected int gagnerArgent(int gain) {
		return argent = argent + gain ;
	}
	
	protected int perdreArgent(int perte) {
		return argent = argent - perte;
	}
	
}
