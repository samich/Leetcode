package Strings;

import java.util.Arrays;

/**
 * 942. DI String Match
 *
 * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
 * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
 *
 * If S[i] == "I", then A[i] < A[i+1]
 * If S[i] == "D", then A[i] > A[i+1]
 *
 * Example 1:
 *
 * Input: "IDID"
 * Output: [0,4,1,3,2]
 *
 * Example 2:
 *
 * Input: "III"
 * Output: [0,1,2,3]
 *
 * Example 3:
 *
 * Input: "DDI"
 * Output: [3,2,0,1]
 *
 * */

public class Problem942 {
    public static void main(String[] args) {

        //example 1:
        String s = "IDID";
        System.out.println(Arrays.toString(diStringMatch(s)));

        //example 2:
        s = "III";
        System.out.println(Arrays.toString(diStringMatch(s)));

        //example 3:
        s = "DDI";
        System.out.println(Arrays.toString(diStringMatch(s)));

    }

    public static int[] diStringMatch(String S) {

        int min = 0;
        int max = S.length();

        int[] arr = new int[S.length() + 1];

        int i = 0;

        for ( ; i < S.length(); i++ ) {

            char c = S.charAt(i);

            if ( c == 'I' ) {

                arr[i] = min;
                min++;

            } else if ( c == 'D' ) {

                arr[i] = max;
                max--;

            }

        }

        int lastDigit;

        if ( S.charAt(S.length()-1) == 'D' ) {
            lastDigit = max;
        } else {
            lastDigit = min;
        }

        arr[i] = lastDigit;

        return arr;

    }

}
