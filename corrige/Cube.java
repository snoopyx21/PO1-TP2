import java.text.MessageFormat;

/**
 * spécialisation Cubique de {@link Pave}
 * (lg = ht = pf)
 */
public class Cube extends Pave {
	/**
	 * nouveau Cube
	 * @param largeur en m
	 */
	public Cube(double largeur) {
		super(largeur, largeur, largeur);
	}
	@Override
	public String toString() {
		return MessageFormat.format("Cube({0}m)", largeur);
	}
}
