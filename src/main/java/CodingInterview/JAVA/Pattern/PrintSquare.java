package CodingInterview.JAVA.Pattern;

public class PrintSquare {

    public static void main(String[] args) {
        // print   * * * *
//                 * * * *
//                 * * * *
//                 * * * *

        for(int i = 0; i<=3; i++){

            for(int j = 0; j<=3; j++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }


}
