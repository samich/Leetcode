package Arrays;

import java.util.Arrays;

/**
 * 905. Sort Array By Parity
 *
 * Given an array A of non-negative integers, return an array consisting of all the
 * even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 * */

public class Problem905 {

    public static void main(String[] args) {

        //example 1:
        int[] arr = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));

        //example 2:
        int[] arr1 = {0,1,2};
        System.out.println(Arrays.toString(sortArrayByParity(arr1)));

        //example 3:
        int[] arr2 = {0};
        System.out.println(Arrays.toString(sortArrayByParity(arr2)));

        //example 4:
        int[] arr3 = {1, 0, 3, 5};
        System.out.println(Arrays.toString(sortArrayByParity(arr3)));

        //example 5:
        int[] arr4 = {0,1};
        System.out.println(Arrays.toString(sortArrayByParity(arr4)));

    }

    public static int[] sortArrayByParity(int[] A) {

        int left = 0;
        int right = A.length -1;

        while (left < right) {

            if ( A[left] % 2 == 0 ) {
                left++;

            } else if ( A[right] % 2 == 1 ) {
                right--;

            } else {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
            }

        }

        return A;

    }

}
