public class LoopPractice5{
   
   //loop1 35, 32, 29, 26, ... (10 terms)
   //slope = -3
   //shift = -3 + ? = 35 --> 38
   public static void loop1(){
      int slope = -3;
      int shift = 38;
      int terms = 10;
      for(int i = 1; i <= terms; i++){
         int n = i*slope + shift;
         System.out.print(n + " ");
      }
      System.out.println();
   }
   
   //loop2 -3, -23, -43, -63, ... (5 terms)
   //slope = -20
   //shift = -3 - ? = -63 --> 60
   public static void loop2(){
      int slope = -20;
      int shift = -3;
      int terms = 4;
      for(int i = 0; i <= terms; i++){
         int n = shift + slope * i;
         System.out.print(n + " ");
      }
      System.out.println();
   }
   
   //loop3 -34, -64, -94, -124, ... (6 terms)
   //slope = -30
   //shift = -34 - ? = -124 --> -90
   public static void loop3(){
      int slope = -30;
      int shift = -34;
      int terms = 5;
      for(int i = 0; i <= terms; i++){
         int n = shift + slope * i;
         System.out.print(n + " ");
      }
      System.out.println();
   }
   
   //loop4 9, 14, 19, 24, ... (6 terms)
   //slope = 5
   //shift = 9 + ? = 24 --> 15
   public static void loop4(){
      int slope = 5;
      int shift = 9;
      int terms = 14;
      for(int i = 1; i <= terms; i++){
         int n = i*slope + shift;
         System.out.print(n + " ");
      }
      System.out.println();
   }
   
   //loop5 -1, 6, -36, 216, ... (5 terms)
   //Multiplier = -6
   //Starrt = -1
   //formula here is start + multipler^i
   public static void loop5(){
      int multi = -6;
      int start = -1;
      int terms = 5;
      //int n = start; //2nd method
      for(int i = 1; i <= terms; i++){
         int n = (int) (start * Math.pow(multi,i - 1));
         System.out.print(n + " ");
         //n = n * multi;  //second method
      }
      System.out.println();
   }
   
   //loop6 -3, -15, -75, -375, ... (6 terms)
   //multi = 5
   //start = -3
   public static void loop6(){
      int multi = 5;
      int start = -3;
      int terms = 6;
      for(int i = 1; i <= terms; i++){
         System.out.print(start + " ");
         start = start * multi;
      }
      System.out.println();
   }
   
   //loop7
   public static void starFiled1(){
      int line = 7;
      
      //prints each line
      for(int i = 1; i <= line; i++){
         //starts
         int slope = 2;
         int shift = 0;
         
         //How many stars should print on each line?
         int stars = slope * i + shift;
         for(int j = 1; j < stars; j++){
            System.out.print("*");
         }
         //new line 
         System.out.println();
      }
   }
   
   //Loop 8
   public static void starField2(){
     int line = 7;
      
      //prints each line
      for(int i = 1; i <= line; i++){
         //starts
         int slope = 2;
        //  int shift = 0;
         
         //how many stars should print on each line?
         int stars = slope * i;
         
         for(int j = 1; j < stars; j++){
            System.out.print("*");
         }
         //new line 
         System.out.println();
      }
   }   
   
}