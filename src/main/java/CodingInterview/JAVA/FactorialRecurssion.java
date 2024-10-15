package CodingInterview.JAVA;

public class FactorialRecurssion {
    public static void main(String[] args) {
        int input = 4;

        int output = factorialOfNum(input);
        System.out.println(output);
    }
    public static int factorialOfNum(int input){
        if(input == 0)
            return 1;
        return input * factorialOfNum(input-1);
    }

}
