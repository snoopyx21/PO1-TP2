/**
 * Materiau immutable portant
 * la masse volumique du dit matériau 
 */
public class Matiere {
	/** facteur de conversion de g vers kg **/
	private static final long G_TO_KG = 1000L;
	/** facteur de conversion de kg/m³ vers m³ **/
	private static final double GM3_TO_KGM3 = 1000L;
	
	// liste fixe de matériaux disponibles
	public static final Matiere BETON     = new Matiere(2200);
	public static final Matiere MARBRE    = new Matiere(2700);
	public static final Matiere VERRE     = new Matiere(2530);
	public static final Matiere ALUMINIUM = new Matiere(2700);
	public static final Matiere METAL     = new Matiere(7900);
	public static final Matiere EAU       = new Matiere(1000);
	public static final Matiere AIR       = new Matiere(1200);
	public static final Matiere PLASTIQUE = new Matiere(1400);
	public static final Matiere BOIS      = new Matiere( 800);

	/** masse volumique en g/m³ */
	private final double masseVolumique;

	/**
	 * nouveau matériau
	 * Note:
	 *   privé car la liste des matériaux
	 *   disponibles est fixée ici même 
	 * @param masseVolumique en kg/m³
	 */
	private Matiere(double masseVolumique)
	{
		this.masseVolumique = masseVolumique / GM3_TO_KGM3;
	}

	/** poids en kg d'une {@link Volume} dans une {@link Matiere} donnée
	 * @param forme
	 * @param matiere
	 * @return poids en kg de la forme dans la matière donnée 
	 */
	public static double poids(Volume forme, Matiere matiere) {
		return forme.getVolume() * matiere.masseVolumique * G_TO_KG;
	}
}
