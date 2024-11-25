import java.util.Scanner;

public class GetInput{

  Scanner kb = new Scanner(System.in);

  public GetInput(){

  }

  public int getInt(){
    System.out.println("Please enter an integer");

    return kb.nextInt();

    }

    public double getDouble(){
      System.out.println("Please enter a double");

      return kb.nextDouble();

      }

      public double getCoord(int t){

        if (t== 1){
           System.out.println("Please enter X1 as a double");
           return kb.nextDouble();

        }

        else if (t== 2){
           System.out.println("Please enter Y1 as a double");
           return kb.nextDouble();

        }

        else if (t== 2){
           System.out.println("Please enter X2 as a double");
           return kb.nextDouble();

        }

        else if (t== 4){
           System.out.println("Please enter Y2 as a double");
           return kb.nextDouble();  

        }

        else
            System.out.println("Something went wrong");
          return 0;
       }
   }
