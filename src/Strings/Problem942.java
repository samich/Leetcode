package Strings;

public class Problem942 {
    public static void main(String[] args) {


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
