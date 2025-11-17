package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int monnaie) {
		super(nom, "thé", monnaie);
	}
	
	public int seFaireExtorquer() {
		// Solution 1 : passer l'attribut monnaie en protected
		// Solution 2 : Créer un setter pour l'attribut monnaie
		
		int res = getMonnaie();
		monnaie = 0;
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return res;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
}
