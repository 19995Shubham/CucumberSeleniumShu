package CodingInterview.JAVA.Arrayss;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] input = {1,2,3,5,6,7,8};
        int[] output = new int[input.length];

        for (int i = input.length-1, j = 0 ;i >=0; i--, j++){
            System.out.println(input[i]);
            output[j] = input[i];



        }
        System.out.println(Arrays.toString(output));
    }
}
