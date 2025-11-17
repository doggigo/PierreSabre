package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonFav, int monnaie) {
		super(nom, boissonFav, monnaie);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauver marchand!");
		int forceRonin = honneur * 2;
		if(forceRonin >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakuza !");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont pris un coup.");
			int monnaie = getMonnaie();
			adversaire.gagner(monnaie);
			perdreArgent(monnaie);
		}
	}
	
	public void donner(Commercant beneficiaire) {
		int monnaie = getMonnaie();
		int don = monnaie / 10;
		
		parler(beneficiaire.getNom() + ", prends ces " + don + " sous");
		beneficiaire.recevoir(don);
		perdreArgent(don);
	}
}
