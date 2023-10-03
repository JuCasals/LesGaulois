package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Village;
import personnages.Druide;	


public class Scenario {
	
    public static void main(String[] args) {
        Village village = new Village("Le village des Gaulois");
        Gaulois obelix = new Gaulois("Obélix", 25);
        Gaulois asterix = new Gaulois("Astérix", 8);
        Romain minus = new Romain("Minus", 6);

        Druide panoramix = new Druide("Panoramix", 5, 10);

        System.out.println(panoramix);

        panoramix.parler("Je vais aller préparer une petite potion...");

        
        int potionStrength = 6;
        panoramix.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + potionStrength + ".");

        panoramix.booster(obelix);
        asterix.parler("Bonjour");
        minus.parler("UN GAU... UN GAUGAU...");

        asterix.frapper(minus);

        System.out.println(minus);

        minus.parler("J'abandonne...");
    }
}