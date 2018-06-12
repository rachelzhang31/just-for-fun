import java.util.*;
import java.io.*;

public class QuadraticEquation
{
   public static void main (String []args)
   {
      Scanner input = new Scanner(System.in);
      double a, b, c, d, e; //variables defined
      boolean entering = true; //true if user is still entering data
      int answer; // used to determine if user wishes to enter more data
      while (entering == true)// is user still entering data?
      {
      //input
         System.out.println ("This program will calculate the solutions to a quadratic equation formatted AX2+BX+C. Please enter the corresponding values for the equation which you are trying to solve.");
         System.out.println("A?");
         a = input.nextInt();
         System.out.println ("B?");
         b = input.nextInt();
         System.out.println("C?");
         c = input.nextInt();
         d = (b*-1 + Math.sqrt((b*b)-4*a*c))/(2*a);       
         e = (b*-1 - Math.sqrt((b*b)-4*a*c))/(2*a);
         System.out.println ("Your answers are " + d + " and " + e);
         System.out.println("Would you like to calculate the solutions to another quadratic equation?");
         System.out.println ("Enter 1 if you wish to continue. Enter anything else if you do not. ");
         answer=input.nextInt();
         if (answer!=1) //user wishes to end program
         {
            entering = false;
            System.out.println ("Have a nice day. Bye now!");
         }
        
        
      }
      
   }
         
}
  

