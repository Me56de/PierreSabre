package histoire;

public class Commercant extends Humain{
	public Commercant(String nom, int argent) {
		super(nom, "the" , argent);
	}
	
	
	public int seFaireExtorquer() {
		System.out.println(parler()+ "J'ai tout perdu! Le monde est trop injuste...");
		return getArgent();
	}
	
	public void recevoir(int argent) {
		System.out.println(parler() + argent + " sous! Je te remercie genereux donateur!");
	}
}
