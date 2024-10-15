package CodingInterview.JAVA;

public class PrimeNumber {
    public static void main(String[] args) {

        int m = 0;
        int n = 5;
        int flag = 0;

        m= n/2;
        if(n == 0 || n == 1){
            System.out.println("Not a prime number");
            flag = 1;
        }
        for(int i = 2; i<=m; i++){

            if(n%i==0){
                System.out.println("not prime");
                flag = 1;
                break;
            }

        }
        if (flag == 0){
            System.out.println("prime number");
        }
    }
}
