package Arrays;

import java.util.Arrays;

public class Problem1460 {

    public static void main(String[] args) {

        //example 1:
        int[] target  = {1, 2, 3, 4, 5};
        int[] arr  = {2, 4, 1, 3, 7};

        System.out.println( canBeEqual(target, arr) );

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
