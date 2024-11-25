public class Slope{

   double numerator;
   double denominator;

   public Slope(){
       numerator = 0.0;
       denominator = 0.0;

   }

   public void findSlope(double x1,double y1, double x2, double y2){
       numerator = y2 - y1;
       denominator = x2 - x1;

       if (numerator < 0 && denominator < 0){
          numerator = numerator * -1;
       denominator = denominator * -1;
       }
       }
       public String typeOfSlope(){
       if (numerator == 0)
       return "The slope is zero.";
       else if (denominator == 0)
       return "The slope id undefined.";
       else if (numerator < 0 || denominator < 0)
       return "The slope is negative.";
       else
       return "The Slope is positive.";

       }

    public void print(double x1, double y1, double x2, double y2, String type){
       System.out.println("The Slope between points ("+x1+", "+y1+") and ("+x2+", "+y2+") is "+numerator+"/"+denominator);
       System.out.println(type);
   }
 }    

