package CodingInterview.JAVA;

public class EvenNumber {
    public static void main(String[] args) {
        int number = 6;
        boolean output = primeNumber(number);
        System.out.println(output);

    }

    public static boolean primeNumber(int number){
        return number%2 == 0;
    }
}
