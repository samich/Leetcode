package Strings;

/**
 * Given a string s formed by digits ('0' - '9') and '#' . We want to map s to English lowercase
 * characters as follows:
 *
 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
 *
 * Return the string formed after mapping.
 *
 * It's guaranteed that a unique mapping will always exist. *
 *
 * */

public class Problem1309 {

    public static void main(String[] args) {

        //example 1:
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));

        //example 2:
        s = "1326#";
        System.out.println(freqAlphabets(s));

        //example 3:
        s = "25#";
        System.out.println(freqAlphabets(s));

        //example 4:
        s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(freqAlphabets(s));

    }

    public static String freqAlphabets(String s) {

        String s1 = "";
        StringBuilder sb = new StringBuilder(s1);

        for (int i = 0; i < s.length() ; i++) {

            int num;

            if ( (i < s.length() - 2 ) && (s.charAt(i + 2) == '#') ) {

                String prevChars = "" + s.charAt(i) + s.charAt(i + 1);
                num = Integer.parseInt(prevChars);
                num = num + 96;

                i += 2;

            } else {
                num = s.charAt(i) + 48;
            }

            char c = (char) num;

            sb.append(c);

        }

        return sb.toString();

    }

}
