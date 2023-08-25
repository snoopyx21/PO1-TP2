/**
 * {@link Volume} composé de sous {@link Volume}s côte à côte
 */
public class VolumeCompose implements Volume {
	/** sous-formes composant la forme */
	private final Volume[] elements;

	/**
	 * nouvelle forme composée
	 * @param formes
	 */
	public VolumeCompose(Volume... formes) {
		this.elements = formes;
	}

	/** @return volume total cumulé en m³ */
	@Override
	public double getVolume() {
		double volume = 0;
		for (Volume element : elements)
			volume += element.getVolume();
		return volume;
	}

	@Override
	public String toString() {
		StringBuilder description = new StringBuilder("{ ");
		boolean premier = true;
		for (Volume element : elements) {
			if (premier)
				premier = false;
			else
				description.append(" ∪ ");
			description.append(element.toString());
		}
		return description.append(" }").toString();
	}
}
