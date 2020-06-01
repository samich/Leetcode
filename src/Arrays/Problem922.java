package Arrays;

import java.util.Arrays;

/**
 * 922. Sort Array By Parity II
 *
 * Given an array A of non-negative integers, half of the integers in A are odd,
 * and half of the integers are even.
 *
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 * You may return any answer array that satisfies this condition.
 *
 * */

public class Problem922 {

    public static void main(String[] args) {

        //example 1:
        int[] arr = {4,2,5,7};
        System.out.println( Arrays.toString(sortArrayByParityII(arr)) );

    }

    public static int[] sortArrayByParityII(int[] A) {

        int even = 0;
        int odd = 1;

        while (even < A.length && odd < A.length) {

            //if there is not even integer at even index
            if ( A[even] % 2 != 0) {

                int temp = A[even];
                A[even] = A[odd];
                A[odd] = temp;

                //as we have already moved an odd integer, so increase its index
                odd += 2;

            } else {

                //if the integer at even index is even, then simply increase it
                even += 2;

            }

        }

        return A;

    }

}
