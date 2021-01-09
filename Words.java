import java.util.Scanner;
import java.io.*;
// This program prints the total number of words in a file.

public class Words {
   public static void main(String[] args) throws FileNotFoundException {
      int wordCount = 0;
      Scanner input = new Scanner(new File("wordinput.txt"));
   	
   	// your code goes here ...
      while(input.hasNext()){
        //  String word = input.next();
         wordCount ++;
      }
   	
      System.out.println("Total words = " + wordCount);
   }
}