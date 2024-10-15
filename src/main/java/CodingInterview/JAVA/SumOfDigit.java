package CodingInterview.JAVA;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int input = sc.nextInt();
        int sum = 0 ,digit = 0;

        while (input!=0){
            digit =  input%10;
            sum   =   sum + digit;
            input /= 10;
        }
        System.out.println(sum);
    }
}
