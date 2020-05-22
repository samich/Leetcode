package Math;

import java.util.Arrays;

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
