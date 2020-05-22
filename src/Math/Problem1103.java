package Math;

import java.util.Arrays;

/**
 * 1103. Distribute Candies to People
 *
 * We distribute some number of candies, to a row of n = num_people people in the following way:
 *
 * We then give 1 candy to the first person, 2 candies to the second person, and so on until we
 * give n candies to the last person.
 *
 * Then, we go back to the start of the row, giving n + 1 candies to the first person, n + 2
 * candies to the second person, and so on until we give 2 * n candies to the last person.
 *
 * This process repeats (with us giving one more candy each time, and moving to the start of the
 * row after we reach the end) until we run out of candies.  The last person will receive all of
 * our remaining candies (not necessarily one more than the previous gift).
 *
 * Return an array (of length num_people and sum candies) that represents the final distribution
 * of candies.
 *
 * */

public class Problem1103 {

    public static void main(String[] args) {

        //example 1:
        int candies = 7;
        int people = 4;
        System.out.println(Arrays.toString(distributeCandies(candies, people)));

        //example 2:
        candies = 10;
        people = 3;
        System.out.println(Arrays.toString(distributeCandies(candies, people)));

        //example 3:
        candies = 80;
        people = 4;
        System.out.println(Arrays.toString(distributeCandies(candies, people)));

    }

    public static int[] distributeCandies(int candies, int num_people) {

        int give = 0;
        int remaining = candies;

        int[] arr = new int[num_people];

        while ( candies > 0 ) {

            for ( int i = 0; i < num_people; i++ ) {

                give++;

                if ( give > remaining ) {
                    give = remaining;
                }

                arr[i] = arr[i] + give;
                remaining = remaining - give;

                if ( remaining <= 0 ) {
                    break;
                }

            }

            candies = remaining;
        }

        return arr;

    }

}
