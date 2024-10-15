package CodingInterview.JAVA.Pattern;

public class PyramidOfNumber {

    /*

    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces for alignment
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Print the numbers for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
