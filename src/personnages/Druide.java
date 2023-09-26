package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
	parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	
	}
	
	public String getNom() {
	return nom;
	
	}
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");
	
	}
	
	private String prendreParole() {
	return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
Random random = new Random();
	    int potionStrength = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;
	    	System.out.println(prendreParole() + "J'ai préparé une " + (potionStrength > 7 ? "super " : "") + "potion de force " + potionStrength);
	    forcePotion = potionStrength;
	}
	
	public static void main(String[] args) {
	    
	Druide panoramix = new Druide("Panoramix", 5, 10);{
	    panoramix.preparerPotion();
	}
}
