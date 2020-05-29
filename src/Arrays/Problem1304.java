package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1304. Find N Unique Integers Sum up to Zero
 *
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 *
 * */

public class Problem1304 {

    public static void main(String[] args) {

        //example 1:
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));

        //example 2:
        n = 7;
        System.out.println(Arrays.toString(sumZero(n)));

        //example 3:
        n = 23;
        System.out.println(Arrays.toString(sumZero(n)));

    }

    public static int[] sumZero(int n) {

        List<Integer> list = new ArrayList<>();

        for ( int i = 0; i < n -1; i += 2 ) {
            int a;
            a = (int) (Math.random() * 1000) + 1;

            while ( list.contains(a) ) {
                a = (int) (Math.random() * 1000) + 1;
            }

            list.add(a);
            list.add(-a);
        }

        int[] arr = new int[n];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;

    }


}
