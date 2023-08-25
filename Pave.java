public class Pave implements Volume{
   private double H;
   private double L;
   private double P;
   public Pave(double L, double H, double P){
      this.L=L;
      this.H=H;
      this.P=P;
   }
   public double getVolume(){
      return L*P*H;
   }

}
