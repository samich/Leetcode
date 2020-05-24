package Strings;

/**
 * 1446. Consecutive Characters
 *
 * Given a string s, the power of the string is the maximum length of a non-empty substring
 * that contains only one unique character.
 *
 * Return the power of the string.
 *
 * */

public class Problem1446 {
    public static void main(String[] args) {

        //example 1
        String s = "leetcode";
        System.out.println(maxPower(s));

        //example 2
        s = "abbcccddddeeeeedcba";
        System.out.println(maxPower(s));

        //example 3
        s = "triplepillooooow";
        System.out.println(maxPower(s));

        //example 4
        s = "hooraaaaaaaaaaay";
        System.out.println(maxPower(s));

        //example 5
        s = "tourist";
        System.out.println(maxPower(s));

    }

    public static int maxPower(String s) {

        if ( s.length() < 2 ){
            return s.length();
        }

        int count = 1;
        int max = 0;

        for ( int i = 1; i < s.length(); i++ ) {

            if ( s.charAt( i ) == s.charAt( i-1 ) ) {
                count++;
            } else {
                count = 1;
            }

            if ( count > max ) {
                max = count;
            }

        }

        return max;

    }

}
