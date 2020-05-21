package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * 804. Unique Morse Code Words
 *
 * International Morse Code defines a standard encoding where each letter is mapped to a series
 * of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and
 * so on.
 *
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 *
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
 *
 * Return the number of different transformations among all words we have.
 *
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 *
 * There are 2 different transformations, "--...-." and "--...--.".
 *
 * */

public class Problem804 {
    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};

        System.out.println(uniqueMorseRepresentations(words));

    }

    public static int uniqueMorseRepresentations(String[] words) {

        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String[] cs = new String[words.length];

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String codeWord = "";

            for (int j = 0; j < word.length(); j++) {

                int c = word.charAt(j);
                int charNum = c - 97;
                codeWord += codes[charNum];

            }

            cs[i] = codeWord;
        }

        List<String> list = new ArrayList<>();

        for (String code : cs ) {
            if ( !list.contains(code) ) {
                list.add(code);
            }
        }

        return list.size();

    }

}
