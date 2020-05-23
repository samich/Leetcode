package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * 890. Find and Replace Pattern
 *
 * You have a list of words and a pattern, and you want to know which words in words matches
 * the pattern.
 *
 * A word matches the pattern if there exists a permutation of letters p so that after replacing
 * every letter x in the pattern with p(x), we get the desired word.
 *
 * (Recall that a permutation of letters is a bijection from letters to letters: every letter maps
 * to another letter, and no two letters map to the same letter.)
 *
 * Return a list of the words in words that match the given pattern.
 *
 * You may return the answer in any order.
 *
 * Example 1:
 *
 * Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
 * Output: ["mee","aqq"]
 * Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
 * "ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
 * since a and b map to the same letter.
 *
 * */

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
