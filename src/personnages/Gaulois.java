package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
 
	private String prendreParole() {
		return "Le gaulois" + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion);
	}
	
	public void boirePotion(int forcePotion) {
	    effetPotion = forcePotion;
	    parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
	}
    
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void setForce(int force) {
	    this.force = force;
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
		
		Gaulois gaulois = new Gaulois("Asterix", 100);
	    Romain romain = new Romain("Julius", 80);

	    System.out.println("Gaulois Initial: " + gaulois);
	    System.out.println("Romain Initial: " + romain);

	    gaulois.boirePotion(5);
	    
	    gaulois.parler("Haut les mains, Romain !");
	    gaulois.frapper(romain);

	    System.out.println("Gaulois mis à jour: " + gaulois);
	    System.out.println("Romain mis à jour: " + romain);
	}
		
}

