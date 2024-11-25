public class SandDriver{
   public static void main(String [] args){


         Slope slo = new Slope();
         Distance dist= new Distance();
         GetInput gi = new GetInput();

         double x1 = gi.getCoord(1);
         double y1 = gi.getCoord(2);
         double x2 = gi.getCoord(3);
         double y2 = gi.getCoord(4);

         dist.findDistance(x1, y1, x2, y2);
         slo.findSlope(x1, y1, x2, y2);
         String type = slo.typeOfSlope();
         dist.print(x1, y1, x2, y2);
         slo.print(x1, y1, x2, y2, type);

       }
    }

