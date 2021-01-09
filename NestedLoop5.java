public class NestedLoop5{
   public static void figure(){
      //print the figure
      
      //loopthough each line
      int line = 7;
      for(int i = 1; i <= line; i++){
         int star = i*2;
         int space = -4 * i + 28;
         //print some *s 2, 4, ,6 ,8 (i * 2)
         for(int j = 1; j <= star; j++){
            System.out.print("*");
         }
         //print some ""s
         for(int j = 1; j <= space; j++){
            System.out.print(" ");
         }
         //print some *s
         for(int j = 1; j <= star; j++){
            System.out.print("*");
         }
         System.out.println();
      }
      
   }
   
}