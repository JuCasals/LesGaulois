package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Village;
import personnages.Druide;	


public class Scenario {
	
    public static void main(String[] args) {
        Village village = new Village("Le village des Gaulois");
        Gaulois obelix = new Gaulois("Ob�lix", 25);
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        Romain minus = new Romain("Minus", 6);

        Druide panoramix = new Druide("Panoramix", 5, 10);

        System.out.println(panoramix);

        panoramix.parler("Je vais aller pr�parer une petite potion...");

        
        int potionStrength = 6;
        panoramix.parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force " + potionStrength + ".");

        panoramix.booster(obelix);
        asterix.parler("Bonjour");
        minus.parler("UN GAU... UN GAUGAU...");

        asterix.frapper(minus);

        System.out.println(minus);

        minus.parler("J'abandonne...");
    }
}