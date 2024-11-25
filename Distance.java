public class Distance{

   double theDistance;

   public Distance(){
      theDistance = 0.0;
   }

   public void findDistance(double x1,double y1,double x2,double y2){
      theDistance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));


}

public void print(double x1,double y1,double x2, double y2){
   System.out.println("The distance between points ("+x1+", "+y1+") and ("+x2+", "+y2+") is "+theDistance);

  }
}     

