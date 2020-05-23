package Strings;

import java.util.ArrayList;
import java.util.List;

public class Problem890 {

    public static void main(String[] args) {

        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "eff";

        System.out.println(findAndReplacePattern(words, pattern));

    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> list = new ArrayList<>();

        for (String word : words) {

            if (checkIsomorphic(word, pattern)) {

                list.add(word);

            }

        }

        return list;

    }

    public static boolean checkIsomorphic(String s1, String s2) {

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {

            int ch1 = s1.charAt(i) - 97;
            int ch2 = s2.charAt(i) - 97;

            if( arr1[ch1] != arr2[ch2] ) {
                return false;
            }

            arr1[ch1] = i+1;
            arr2[ch2] = i+1;

        }

        return true;

    }


}
