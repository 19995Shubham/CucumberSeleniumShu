package CodingInterview.JAVA;

import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer");
        int input = sc.nextInt();
        int rev = 0;

        while (input!=0){
            rev = rev*10 + input%10;
            input /=10;
        }
        System.out.println(rev);
    }
}
