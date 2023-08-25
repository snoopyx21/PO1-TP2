import java.text.MessageFormat;

/** {@link Volume} Cylindre */
public class Cylindre implements Volume {
	protected final double rayon;
	protected final double hauteur;
	/**
	 * nouveau {@link Cylindre}
	 * @param rayon en m
	 * @param hauteur en m
	 */
	public Cylindre(double rayon, double hauteur) {
		this.rayon = rayon;
		this.hauteur = hauteur;
	}
	@Override
	public double getVolume() {
		return hauteur * rayon * rayon * Math.PI;
	}
	@Override
	public String toString() {
		return MessageFormat.format("Cylindre({0}m × ⌀{1}m)", hauteur, 2*rayon);
	}
}
