package CodingInterview.JAVA;

public class SwichCaseCalculator {

    public static void main(String[] args) {

        int num1 = 10, num2 = 20, res;
        String symbol = "$";

        switch (symbol){
            case "+" : res =  num1 +num2;
            {
                System.out.println(res);
                break;
            }
            case "-": res = num1 - num2;
            {
                System.out.println(res);
                break;
            }
            case "*": res = num1 * num2;{
                System.out.println(res);
                break;
            }
            case "/": res = num2/num1;{
                System.out.println(res);
                break;
            }
            default:
                System.out.println("Please enter valid symbol");
        }
    }
}
