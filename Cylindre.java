public class Cylindre implements Volume{
   private double R;
   private double H;
   public Cylindre(double R,double H){
       this.R=R;
       this.H=H;   
   }
   public double getVolume(){
       return Math.PI*R*R*H;
   }

}
