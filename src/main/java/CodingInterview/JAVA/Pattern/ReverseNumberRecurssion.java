package CodingInterview.JAVA.Pattern;

public class ReverseNumberRecurssion {

    public static void main(String[] args) {

        int num = 1234;
        int rev = 0;

       int output = reverseNumber(num, rev);
        System.out.println(output);
    }

    private static int reverseNumber(int num, int rev) {
        if(num == 0)
            return rev;
        return reverseNumber(num/10, rev*10 + num%10);
    }
}
