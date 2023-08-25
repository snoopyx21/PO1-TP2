import java.text.MessageFormat;

/**
 * spécialisation de {@link Volume} pour une sphère
 */
public class Sphere implements Volume {
	/** rayon en m */
	private final double rayon;
	/**
	 * nouvelle Sphère
	 * @param rayon en m
	 */
	public Sphere(double rayon) {
		this.rayon = rayon;
	}
	@Override
	public double getVolume() {
		return 4*rayon*rayon*rayon*Math.PI / 3;
	}
	@Override
	public String toString() {
		return MessageFormat.format("Sphère(⌀{0}m)", 2*rayon);
	}
}
