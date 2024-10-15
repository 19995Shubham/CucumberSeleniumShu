package CodingInterview.JAVA;

public class PrintPrimeNumber {

    public static void main(String[] args) {

        for(int num = 1; num <=101; num++){
         if(isPrimeNumber(num)){
             System.out.println(num + "prime number");
         }

        }
    }

    public static boolean isPrimeNumber(int a){

        if(a == 0 || a== 1){
            return false;
        }
        for(int j = 2; j < a; j++){
            if(a%j == 0){
                return false;
            }
        }
        return true;
    }

}
