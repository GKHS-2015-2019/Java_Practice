// Chris Student, CSE 142, winter 2016
// Programming Assignment #1, 06/07/42
//
// This program's behavior is to print out a cumlative song
public class Song{
   public static void main(String[] args){
      ver1();
      ver2();
      ver3();
      ver4();
      ver5();
      ver6();
      ver7();
   }

   //prints the first verse
   public static void ver1(){
      System.out.println("On the 1st day of \"Xmas\", my true love gave to me");
      tree();
      space();
   }
   //prints the second verse
   public static void ver2(){
      System.out.println("On the 2nd day of \"Xmas\", my true love gave to me");
      dove();
      space();
   }
   //prints the third verse
   public static void ver3(){
      System.out.println("On the 3rd day of \"Xmas\", my true love gave to me");
      hens();
      space();
   }
   //prints the fourth verse
   public static void ver4(){
      System.out.println("On the 4th day of \"Xmas\", my true love gave to me");
      birds();
      space();
   }
   //prints the fifth verse
   public static void ver5(){
      System.out.println("On the 5th day of \"Xmas\", my true love gave to me");
      rings();
      space();
   }
   //prints the sixth verse
   public static void ver6(){
      System.out.println("On the 6th day of \"Xmas\", my true love gave to me");
      geese();
      space();
   }
   //prints the seventh verse
   public static void ver7(){
      System.out.println("On the 7th day of \"Xmas\", my dog gave to me");
      System.out.println("3 headaches,");
      System.out.println("2 bit marks, and");
      System.out.println("1 wet carpet.");
   }
   
   public static void space(){
      System.out.println("");
   }
   public static void tree(){
      System.out.println("a partridge in a pear tree.");
   }
   public static void dove(){
      System.out.println("two turtle doves, and");
      tree();
   }
   public static void hens(){
      System.out.println("three French hens,");
      dove();
   }
   public static void birds(){
      System.out.println("four calling birds,");
      hens();
   }
   public static void rings(){
      System.out.println("five golden rings,");
      birds();
   }
   public static void geese(){
      System.out.println("six geese a-laying,");
      rings();
   }
   
}