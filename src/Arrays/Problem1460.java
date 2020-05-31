package Arrays;

import java.util.Arrays;

public class Problem1460 {

    public static void main(String[] args) {

        //example 1:
        int[] target  = {1, 2, 3, 4, 5};
        int[] arr  = {2, 4, 1, 3, 7};
        System.out.println( canBeEqual(target, arr) );

        //example 2:
        int[] target1  = {7};
        int[] arr1  = {7};
        System.out.println( canBeEqual(target1, arr1) );

        //example 3:
        int[] target2  = {1, 12};
        int[] arr2  = {12, 1};
        System.out.println( canBeEqual(target2, arr2) );

    }

    public static boolean canBeEqual(int[] target, int[] arr) {

        Arrays.sort(target);
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if ( arr[i] != target[i] ) {
                return false;
            }

        }

        return true;

    }

}
