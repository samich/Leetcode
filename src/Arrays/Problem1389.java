package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1389. Create Target Array in the Given Order
 *
 * Given two arrays of integers nums and index. Your task is to create target array under
 * the following rules:
 *
 * Initially target array is empty.
 * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and index.
 *
 * Return the target array.
 *
 * It is guaranteed that the insertion operations will be valid.
 *
 * */

public class Problem1389 {

    public static void main(String[] args) {

        //example 1:
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray( nums, index )));

        //example 2:
        int[] nums1 = {1,2,3,4,0};
        int[] index1 = {0,1,2,3,0};
        System.out.println(Arrays.toString(createTargetArray( nums1, index1 )));

    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int atIndex = index[i];

            list.add(atIndex, num);

        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;

    }


}
