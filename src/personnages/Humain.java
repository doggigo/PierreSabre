package personnages;

public class Humain {
	protected String nom;
	private String boissonFav;
	private int monnaie;

	public Humain(String nom, String boissonFav, int monnaie) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.monnaie = monnaie;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getMonnaie() {
		return monnaie;
	}
	
	protected void parler(String string) {
		System.out.println("(" + nom + ") - " + string);
		
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav);
	}
	

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain) {
		this.monnaie += gain;
	}
	
	protected void perdreArgent(int perte) {
		this.monnaie -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if(prix <= monnaie) {
			parler("J'ai " + monnaie + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + monnaie + " sous en poche. Je ne peux même pas m'offrir un + " + bien + " à " + prix + " sous.");
		}
	}
	
}


