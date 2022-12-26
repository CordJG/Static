import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] sum = new int[arr1.length + arr2.length];


        System.arraycopy(arr1, 0, sum, 0, arr1.length);
        System.arraycopy(arr2, 0, sum, arr1.length, arr2.length);
        System.out.println(Arrays.toString(sum));

    }

    }



