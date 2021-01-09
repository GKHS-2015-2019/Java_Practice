public class Loops5{
   //tester loop
   public static void main(String[] args){
      testLoop4();
   }
   
   //test loop 1 to 5     (prints the following 1,2,3,4,5, groovy
   //                                           Awseomeness
   public static void testLoop1(){
      for(int i = 1; i <= 5; i++){
         System.out.print(i + ", ");
      }
      System.out.println("Groovy");
      System.out.println("Awsomeness");
   }
   
   //testLoop2 print 5 to 50 go up by 5 each time {...;i+=5} Words: Dandy  nerfHerder
   public static void testLoop2(){
      for(int i = 5; i <= 50; i += 5){
         System.out.print(i + ", ");
      }
      System.out.println("Dandy");
      System.out.println("nerfHerder");
   }
   
   //testLoop3 print form 1 to 100000 up by 1 each time on a new line
   public static void testLoop3(){
      for(int i =1; i<= 100000; i++){
         System.out.println(i);
      }
   }
   
   //testLoop4 print from 100 to 1 going backwards make sure to change the <= to >=
   public static void testLoop4(){
      for(int i = 100; i >= 1; i--){
         System.out.println(i);
      }
   }
}