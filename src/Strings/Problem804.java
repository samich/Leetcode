package Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
