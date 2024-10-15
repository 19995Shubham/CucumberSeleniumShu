package CodingInterview.JAVA;

public class LargetInArray {

    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 4;
        arr[3] = 6;
        arr[4] = 5;


        int max = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println(arr[i]);
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max + "max");
    }
}