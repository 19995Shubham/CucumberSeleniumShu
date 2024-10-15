package CodingInterview.JAVA;

public class SumOfDigitRecurssion {



    public static void main(String[] args) {
        int input = 1403;
        int output = sumOfDigit(input);
        System.out.println(output);
    }

    public static int sumOfDigit(int input){
        if(input == 0)
            return 0;
        return input%10 + sumOfDigit(input/10);
    }
}
