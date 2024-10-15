package CodingInterview.JAVA;

public class FibonacciSeries {

    public static void main(String[] args) {

        int input = 10, first = 0, second = 1, next;

        for(int i =2; i<=input; i++ ){
            next = first + second;
            System.out.println(" "+next);
            first = second;
            second = next;
        }

    }
}
