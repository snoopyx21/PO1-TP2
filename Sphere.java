public class Sphere implements Volume{
   private double R;   
   public Sphere(double R){
      this.R=R;
   }
   public double getVolume(){
       return (4/3)*Math.PI*R*R*R;
   }

} 
