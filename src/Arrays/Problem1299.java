package Arrays;

import java.util.Arrays;

public class Problem1299 {
    public static void main(String[] args) {

        //example 1:
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr)));

        //example 2:
        int[] arr2 = {32, 6, 197, 4, 332, 87};
        System.out.println(Arrays.toString(replaceElements(arr2)));
    }

    public static int[] replaceElements(int[] arr) {

        int[] nums = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int highestNum = Integer.MIN_VALUE;

            for (int j = i+1; j < arr.length; j++) {

                if ( arr[j] > highestNum ) {
                    highestNum = arr[j];
                }

            }

            nums[i] = highestNum;

        }

        //replace last index with -1
        nums[arr.length - 1] = -1;

        return nums;

    }

}
