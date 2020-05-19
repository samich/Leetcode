package TwoPointers;

import java.util.Arrays;

public class Problem26 {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

        int j = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if ( nums[i] != nums[j] ) {

                j++;
                nums[j] = nums[i];
            }

        }

        return j + 1;
    }

}
