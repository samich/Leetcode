package Arrays;

import java.util.Arrays;

public class Problem1051 {

    public static void main(String[] args) {

        //example 1:
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println( heightChecker(heights) );

        //example 2:
        int[] heights1 = {5, 1, 2, 3, 4};
        System.out.println( heightChecker(heights1) );

        //example 3:
        int[] heights2 = {1, 2, 3, 4, 5};
        System.out.println( heightChecker(heights2) );

    }

    public static int heightChecker(int[] heights) {

        //declare an array to copy the original array
        int[] unsortedArr = new int[heights.length];

        //copy array
        System.arraycopy(heights, 0, unsortedArr, 0, heights.length);

        //sort original heights array
        Arrays.sort(heights);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {

            if ( unsortedArr[i] != heights[i] ) {
                count++;
            }

        }

        return count;

    }
}
