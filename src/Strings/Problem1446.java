package Strings;

public class Problem1446 {
    public static void main(String[] args) {

        String s = "leetcode";
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
