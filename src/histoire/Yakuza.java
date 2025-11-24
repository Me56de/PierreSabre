package histoire;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public int perdre() {
        int argentPerdu = argent;
        perdreArgent(argentPerdu); 
        reputation--;

        System.out.println("(" + getNom() + ") - J’ai perdu mon duel et mes " +
                argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");

        return argentPerdu;
    }
	
	public void gagner(int gain) {
        gagnerArgent(gain);
        reputation++;

        System.out.println("(" + getNom() + ") - Ce ronin pensait vraiment battre "
                + getNom() + " du clan de " + clan + " ?\nJe l'ai dépouillé de ses "
                + gain + " sous.");
    }



	public void extorquer(Commercant victime) {
		System.out.println(parler() + " Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println(parler()+ victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int montantVole = victime.seFaireExtorquer();
		
		setArgent(getArgent() + montantVole);
		reputation++;
		System.out.println(parler() + "J’ai piqué les " + montantVole + " sous de " + victime.getNom() + ", ce qui me fait "
				+ getArgent() + " sous dans ma poche. Hi ! Hi !");
	}

}
