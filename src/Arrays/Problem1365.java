package Arrays;

import java.util.Arrays;

public class Problem1365 {

    public static void main(String[] args) {

        int[] nums = { 8, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

        int[] nums1 = { 6,5,4,8 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums1)));

        int[] nums2 = { 7,7,7,7 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums2)));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if ( nums[i] > nums[j] ) {
                    count++;
                }

            }

            arr[i] = count;

        }

        return arr;

    }

}
