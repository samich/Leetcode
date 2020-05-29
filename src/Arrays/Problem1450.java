package Arrays;

/**
 * 1450. Number of Students Doing Homework at a Given Time
 * Given two integer arrays startTime and endTime and given an integer queryTime.
 *
 * The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].
 *
 * Return the number of students doing their homework at time queryTime. More formally, return the number of
 * students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
 *
*/

public class Problem1450 {
    public static void main(String[] args) {

        //example 1:
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        int queryTime = 4;
        System.out.println(busyStudent( startTime, endTime, queryTime ));

        //example 2:
        startTime = new int[] {4};
        endTime = new int[] {4};
        queryTime = 4;
        System.out.println(busyStudent( startTime, endTime, queryTime ));

        //example 3:
        startTime = new int[] {4};
        endTime = new int[] {4};
        queryTime = 5;
        System.out.println(busyStudent( startTime, endTime, queryTime ));

        //example 4:
        startTime = new int[] {1, 1, 1, 1};
        endTime = new int[] {1, 3, 2, 4};
        queryTime = 7;
        System.out.println(busyStudent( startTime, endTime, queryTime ));

        //example 5:
        startTime = new int[] {9,8,7,6,5,4,3,2,1};
        endTime = new int[] {10,10,10,10,10,10,10,10,10};
        queryTime = 5;
        System.out.println(busyStudent( startTime, endTime, queryTime ));

    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int count = 0;

        for ( int i = 0; i < startTime.length; i++ ) {

            if ( queryTime >= startTime[i] && queryTime <= endTime[i] ) {
                count++;
            }
        }

        return count;

    }
}
