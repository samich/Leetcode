package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
