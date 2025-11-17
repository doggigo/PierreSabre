package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("kimono", 50);
	
		Commercant marco = new Commercant("Marco", 20);
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		marco.direBonjour();
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
		marco.recevoir(15);
		marco.boire();
		
		Ronin roro = new Ronin("Roro", "sochu", 60);
		roro.direBonjour();
		
		roro.donner(marco);
		
		roro.provoquer(yakuLeNoir);
	}
}
