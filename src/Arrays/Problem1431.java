package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 1431. Kids With the Greatest Number of Candies
 *
 * Given the array candies and the integer extraCandies, where candies[i] represents the
 * number of candies that the ith kid has.
 *
 * For each kid check if there is a way to distribute extraCandies among the kids such that
 * he or she can have the greatest number of candies among them. Notice that multiple kids
 * can have the greatest number of candies.
 *
 * */

public class Problem1431 {

    public static void main(String[] args) {

        //example 1
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies).toString());

        //example 2
        int[] candies1 = {4,2,1,1,2};
        extraCandies = 1;
        System.out.println(kidsWithCandies(candies1, extraCandies).toString());

        //example 3
        int[] candies2 = {12,1,12};
        extraCandies = 10;
        System.out.println(kidsWithCandies(candies2, extraCandies).toString());

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();

        int max = candies[0];

        //get the max num
        for ( int i = 1; i < candies.length; i++ ) {

            if ( candies[i] > max ) {
                max = candies[i];
            }
        }

        for (int candy : candies) {

            //if current index num + extra candies >= max add true, else false
            list.add(candy + extraCandies >= max);

        }

        return list;

    }

}
