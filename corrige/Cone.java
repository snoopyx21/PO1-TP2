import java.text.MessageFormat;

/** Spécialise {@link Cylindre} en pointe */
public class Cone extends Cylindre {
	/**
	 * nouveau cône
	 * @param rayon  en m
	 * @param hauteur en m
	 */
	public Cone(double rayon, double hauteur) {
		super(rayon, hauteur);
	}
	@Override
	public double getVolume() {
		return super.getVolume()/3;
	}
	@Override
	public String toString() {
		return MessageFormat.format("Cône({0}m × ⌀{1}m)", hauteur, 2*rayon);
	}
}
