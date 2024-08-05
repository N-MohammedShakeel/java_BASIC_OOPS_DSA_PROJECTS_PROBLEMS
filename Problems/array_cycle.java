package Problems;

import java.util.Arrays;

import java.util.Arrays;

public class array_cycle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        rotateArray(arr);
        rotateArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}
