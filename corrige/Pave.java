import java.text.MessageFormat;

/**
 * Spécialisation rectangulaire de {@link Volume}
 */
public class Pave implements Volume {
	protected final double largeur;
	protected final double hauteur;
	protected final double profondeur;

	/**
	 * Nouveau pavé
	 * @param largeur en m
	 * @param hauteur en m
	 * @param profondeur en m
	 */
	public Pave(double largeur, double hauteur, double profondeur ) {
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.profondeur = profondeur;
	}

	@Override
	public double getVolume() {
		return largeur * hauteur * profondeur;
	}

	@Override
	public String toString() {
		return MessageFormat.format("Pavé({0}m × {1}m × {2}m)", largeur, hauteur, profondeur);
	}

}
