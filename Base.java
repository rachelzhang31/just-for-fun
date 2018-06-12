/**
Reads SampleBaseInput.txt to convert recursively between base 10 and destination base. 
The lines in the text file are in groups of 4. The first line is the "destination" base (2<=base<=10). 
The next three lines are base 10 numbers that need to be converted to the destination base. 
Returns a string. **/

import java.util.*;
import java.io.*;
public class Base{
   public static void main(String[] args)
   {   
      Scanner infile = null;
      try
      {
         infile = new Scanner(new File("SampleBaseInput.txt")); //searches for file
      }
      catch(FileNotFoundException e)
      {
         System.out.println("Error: SampleBaseInput.txt  not found. Exiting program.");
         System.exit(0);
      } 
      
      while(infile.hasNextLine())//reads file
      {
         
         int reader = infile.nextInt();
         for(int i = 0; i < 3; i++)
         {
            int saver = infile.nextInt();
            System.out.println(baser(saver, reader));
         }
      }
   
        
   }
   
   
   public static String baser(int num, int num2)//pre: numbers are base 10
   //post: converts to destination base
   {
      if (num < num2)
      return "" + num;
      else
      return baser(num/num2, num2) + num%num2;
        
   
   }
}
