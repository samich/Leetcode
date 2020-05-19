package TwoPointers;

import java.util.Arrays;

public class Problem80 {

    public static void main(String[] args) {

        int[] nums = {0, 0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

        if ( nums == null || nums.length == 0 ) {
            return 0;
        }


        int left = 0;
        int right = 0;

        while ( right < nums.length ) {

            nums[left] = nums[right];

            if ( left < 2 || nums[left] != nums[left - 2] ) {

                left++;
            }

            right++;
        }

        System.out.println(Arrays.toString(nums));


        return left;
    }


}
