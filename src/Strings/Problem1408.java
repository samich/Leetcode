package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * 1408. String Matching in an Array
 *
 * Given an array of string words. Return all strings in words which is substring of another word in any order.
 *
 * String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right
 * side of words[j].
 *
 * */

public class Problem1408 {

    public static void main(String[] args) {

        //example 1:
        String[] s = {"mass", "as", "hero", "superhero"};
        //System.out.println(stringMatching(s).toString());

        //example 2:
        String[] s1 = {"blue","green","bu"};
        //System.out.println(stringMatching(s1).toString());

        //example 3:
        String[] s2 = { "uexk","aeuexkf","wgxih","yuexk","gxea","yuexkm","ypmfx","jjuexkmb","wqpri","aeuexkfpo","kqtnz","pkqtnza","nrbb","hmypmfx","krqs","jjuexkmbyt","zvru","ypmfxj"};
        System.out.println(stringMatching(s2).toString());

    }

    public static List<String> stringMatching(String[] words) {

        List<String> list = new ArrayList<>();

        String appendStr = "";

        //concat all words together
        for(String word : words) {
            appendStr = appendStr.concat(word).concat("|");
        }

        for (String word : words ) {

            int firstMatch = appendStr.indexOf(word);
            int lastMatch = appendStr.lastIndexOf(word);

            if ( firstMatch != -1 && lastMatch != -1 && firstMatch != lastMatch) {
                list.add(word);
            }

        }

        return list;

    }

}
