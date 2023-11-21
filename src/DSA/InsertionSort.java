package DSA;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {55, 33, 45, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
// For 1st pass, i.e. i = 0, first two elements will be sorted
// For 2nd pass, i.e. i = 1, first three elements will be sorted
// j will always be equal to i + 1. it will sort the array by moving left
// if the element to be swapped is already greater than the previous element, loop will break.
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {  // i < (n-2)
            for (int j = i + 1; j > 0; j--) {       // j > 0 always
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
