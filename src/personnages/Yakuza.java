package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	
	public Yakuza(String nom, String boissonFav, int monnaie, String clan) {
		super(nom, boissonFav, monnaie);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchant qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int recolte = victime.seFaireExtorquer();
		gagnerArgent(recolte);
		parler("J'ai piqué les " + recolte + " sous de " + victime.getNom() + ", ce qui me fait " + monnaie + " sous dans ma poche. Hi ! Hi !");
	}
	
}
