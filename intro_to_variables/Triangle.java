public class Triangle {
   public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) {
            int numStar = -2*line+9;
            for (int stars = 1; stars <= numStar; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

   }
}