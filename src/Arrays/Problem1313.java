package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1313. Decompress Run-Length Encoded List
 *
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
 * For each such pair, there are freq elements with value val concatenated in a sublist.
 * Concatenate all the sublists from left to right to generate the decompressed list.
 *
 * Return the decompressed list.
 *
 * */

public class Problem1313 {

    public static void main(String[] args) {

        //example 1:
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(decompressRLElist(nums)));

        //example 2:
        int[] nums1 = { 1, 1, 2, 3 };
        System.out.println(Arrays.toString(decompressRLElist(nums1)));

    }

    public static int[] decompressRLElist(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for ( int i = 0; i < nums.length; i += 2 ) {

            int freq = nums[i];

            for (int j = 0; j < freq; j++) {
                list.add(nums[i+1]);
            }

        }

        int[] arr = new int[list.size()];

        for ( int i = 0; i < arr.length; i++ ){
            arr[i] = list.get(i);
        }

        return arr;

    }

}
