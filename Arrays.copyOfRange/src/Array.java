import java.util.*;

public class Array{
    public static void main(String[] args){

        int n= 2;
        int[] arr={1,2,3,4,5,6};

        if (n >= arr.length) {
           arr = new int[]{};
        }

        int[] result = Arrays.copyOfRange(arr, n, arr.length);
        System.out.println(Arrays.toString(result));
    }
}