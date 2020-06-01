package Arrays;

import java.util.Arrays;

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

            if ( A[even] % 2 != 0) {

                int temp = A[even];
                A[even] = A[odd];
                A[odd] = temp;

                odd += 2;

            } else {

                even += 2;

            }

        }

        return A;

    }

}
