package CodingInterview.JAVA;

import java.util.Scanner;

public class ReverseString {
    // Reverse a String without Using the Built-in reverse() Method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();
        String output = "";

        for(int i = 0; i<=input.length()-1; i++){
            output = input.charAt(i)+ output;
        }
        System.out.println(output);
    }
}
