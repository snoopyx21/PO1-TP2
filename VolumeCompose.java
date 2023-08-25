public class VolumeCompose implements Volume{
   Volume [] elements;
   public VolumeCompose(Volume [] elements){
       this.elements=elements;
   }
   public double getVolume(){
       double resultat=0;
       for(Volume e:elements){
           e.getVolume();
       }
       return resultat;
   }
}
