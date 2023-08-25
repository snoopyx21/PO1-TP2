public class Cone extends Cylindre {
   public Cone(double R, double H){
       super(R,H);
   }
   public double getVolume(){
       return super.getVolume()/3;
   }
}
