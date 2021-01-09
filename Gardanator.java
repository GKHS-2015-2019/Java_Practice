import java.util.Scanner;

public class Gardanator {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      introduction();
      /*double midterm =*/ midterm(sc);
      finalTest(sc);
   }
   public static void introduction(){
      System.out.println("This program reads exam/homework scores and reports your overall course grade.");
   }
   
   public static void test(Scanner sc) {
      System.out.print("Weight (0-100)? ");  //20
      int weight = sc.nextInt();
      System.out.print("Score earned? ");    //78
      int score = sc.nextInt();
      System.out.print("Were scores shifted (1=yes, 2=no)? ");  //2
      int shift = sc.nextInt();
      if (shift == 1) {
         System.out.print("Shift amount?" );
         int shiftAmount = sc.nextInt();
         score += shiftAmount;
      } else {
         int shiftAmount = 0;
         score += shiftAmount;
      }
      double wScore = (double) score/100 * weight;
      System.out.println("Total points = " + score + " / 100");
      System.out.println("Weighted score = " + String.format( "%.1f", wScore) + " / " + weight);
   }
   
   public static void midterm(Scanner sc){
      test(sc);
   }
   public static void finalTest(Scanner sc){
      test(sc);
   }
}