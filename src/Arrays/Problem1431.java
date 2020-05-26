package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Problem1431 {

    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;

        System.out.println(kidsWithCandies(candies, extraCandies).toString());
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
