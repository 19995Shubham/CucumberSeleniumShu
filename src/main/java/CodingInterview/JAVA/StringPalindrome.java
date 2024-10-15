package CodingInterview.JAVA;

public class StringPalindrome {

    public static void main(String[] args) {
        String input = "GuaintuG";
        boolean output = checkPalindrome(input);
        System.out.println(output);
    }

    public static boolean checkPalindrome(String input){
        int start = 0;
        int end = input.length()-1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;

            }
            start++;
            end--;
        }
        return true;
    }
}
