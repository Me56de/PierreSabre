package histoire;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void donner(Commercant beneficiaire) {
		int don = getArgent() / 10;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		setArgent(getArgent() - don);
		beneficiaire.recevoir(don);
	}

	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur;
		parler("Je t’ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand");

		if (force >= adversaire.getReputation()) {
			int argentGagne = adversaire.perdre();
			gagnerArgent(argentGagne);
			honneur++;

			parler("Je t'ai eu petit yakusa!");
		} else {

			int argentPerdu = getArgent();
			honneur--;
			setArgent(0);
			adversaire.gagner(argentPerdu);

			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		}
	}

}
