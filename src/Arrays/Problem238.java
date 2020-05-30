package Arrays;

import java.util.Arrays;

/**
 * 238. Product of Array Except Self
 *
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is
 * equal to the product of all the elements of nums except nums[i].
 *
 * (Note: This is very slow approach, it should be done in O(n).
 * */

public class Problem238 {

    public static void main(String[] args) {

        //example 1:
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

    public static int[] productExceptSelf(int[] nums) {

        int[] out = new int[nums.length];


        for ( int i = 0; i < nums.length; i++ ) {

            int val = 1;

            for (int j = 0; j < nums.length; j++) {

                if ( i != j ) {
                    val *= nums[j];
                }

            }

            out[i] = val;

        }

        return out;

    }

}
