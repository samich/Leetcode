package Arrays;

import java.util.Arrays;



public class Problem238 {

    public static void main(String[] args) {

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
