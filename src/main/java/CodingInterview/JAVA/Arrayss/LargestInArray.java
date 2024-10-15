package CodingInterview.JAVA.Arrayss;

public class LargestInArray {

    public static void main(String[] args) {

        int[] input = {1,10,5,9,11,7,8};
        int output = 0;
        for(int i = 0; i<=input.length-1; i++){

            for(int j = i+1; j <= input.length-1; j++){

                if (input[i]> input[j]) {
                    output = input[i];

                }
            }
        }
        System.out.println(output);
    }
}
