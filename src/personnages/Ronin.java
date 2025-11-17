package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonFav, int monnaie) {
		super(nom, boissonFav, monnaie);
	}

	public void donner(Commercant beneficiaire) {
		int don = monnaie / 10;
		
		parler(beneficiaire.getNom() + ", prends ces " + don + " sous");
		beneficiaire.recevoir(don);
		perdreArgent(don);
	}
}
