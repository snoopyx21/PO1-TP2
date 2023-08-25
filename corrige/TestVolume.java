/**
 * Teste la validité des Volumes élémentaires 
 */
public class TestVolume {
	/** seuil d'erreur autorisé (en m³) */
	private static final double EPSILON = 0.000000001;

	/** teste un volume attendu vs calculé
	 * @param forme une forme donnée non nulle
	 * @param attendu un volume en m³ attendu
	 * effets de bords: affiche un retour à l'écran
	 */
	public static void testVolume(Volume forme, double attendu) {
		double volume = forme.getVolume();
		if (Math.abs(volume - attendu) > EPSILON)
			System.out.println("ERREUR: la forme " + forme
					+ " n'a pas le volume attendu " + attendu
					+ " mais " + volume);
		else
			System.out.println("la forme " + forme
					+ " a le volume attendu " + attendu);
	}
	
	/** deux lots de tests pour
	 * les volumes élémentaires
	 */
	public static void main(String[] args) {
		testVolume(new Pave(1,2,3), 6);
		testVolume(new Cube(1), 1);
		testVolume(new Cylindre(1, 2), 2*Math.PI);
		testVolume(new Cone(1, 2), 2*Math.PI/3);
		testVolume(new Sphere(1), 4*Math.PI/3);
		testVolume(new Pave(0,0,0), 0);
		testVolume(new Cube(0), 0);
		testVolume(new Cylindre(0, 0), 0);
		testVolume(new Cone(0, 0), 0);
		testVolume(new Sphere(0), 0);
	}
}
