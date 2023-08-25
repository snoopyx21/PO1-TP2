import java.text.DecimalFormat;

public class TableJardin {
	/**
	 * poids d'un modèle de table donné
	 * décliné en plusieurs matériaux  
	 */
	public static void main(String[] args) {
		Volume plateau = new Pave(1.20, 0.80, 0.028);
		Volume pied = new Cylindre(.06/2, 0.75 - 0.028);
		Volume table = new VolumeCompose(plateau, pied, pied, pied, pied);
		System.out.println("les tables " + table + " pèsent :");
		DecimalFormat df = new DecimalFormat(); // affiche joliment les réels
		System.out.println(df.format(Matiere.poids(table, Matiere.BOIS)) + "kg en bois");
		System.out.println(df.format(Matiere.poids(table, Matiere.METAL)) + "kg en métal");
		System.out.println(df.format(Matiere.poids(table, Matiere.PLASTIQUE)) + "kg en plastique");
	}
}
