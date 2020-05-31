package Arrays;

import java.util.Arrays;

/**
 * 1051. Height Checker
 *
 * Students are asked to stand in non-decreasing order of heights for an annual photo.
 *
 * Return the minimum number of students that must move in order for all students to be
 * standing in non-decreasing order of height.
 *
 * Notice that when a group of students is selected they can reorder in any possible way
 * between themselves and the non selected students remain on their seats.
 *
*/

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
