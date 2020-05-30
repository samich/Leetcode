package Arrays;

import java.util.Arrays;

/**
 * 238. Product of Array Except Self
 *
 * Given an array nums of n integers where n > 1,  return an array output such that output[i]
 * is equal to the product of all the elements of nums except nums[i].
 *
 * Note: This is according to the following requirements:
 * Note: Please solve it without division and in O(n).
 *
 * The idea is that we calculate the product of integers on the left, and on the right and then multiply
 * when calculating the left, the first index has to be one because for example if array has "3", it is
 * possible only after it multiplied by 1.
 * same with the right most index when calculating product of integers on the right of the integer
 * */

public class Problem238_1 {

    public static void main(String[] args) {

        //example 1:
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

    public static int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        int[] output = new int[nums.length];

        left[0] = 1;
        right[nums.length-1] = 1;

        int product = 1;

        //calculate sum of all integers on the left
        for (int i = 1; i < nums.length; i++) {

            product *= nums[i-1];
            left[i] = product;

        }

        product = 1;
        //calculate sum of all integers on the right
        for (int i = nums.length - 2; i >= 0; i--) {

            product *= nums[i+1];
            right[i] = product;

        }

        //multiply both i-th elements
        for (int i = 0; i < nums.length; i++) {
            output[i] = left[i] * right[i];
        }

        return output;

    }

}
