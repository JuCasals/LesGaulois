package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
	
	 Gaulois asterix = new Gaulois("Astérix", 8); {
		 System.out.println("Le gaulois " + asterix.getNom() + " : « Bonjour à tous »");
	 }
     
    
	 Romain minus = new Romain("Minus", 6); {
		 System.out.println("Le romain " + minus.getNom() + " : « UN GAU... UN GAUGAU... »");
	 }

}