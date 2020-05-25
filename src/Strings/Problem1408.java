package Strings;

import java.util.ArrayList;
import java.util.List;

public class Problem1408 {

    public static void main(String[] args) {

    }

    public static List<String> stringMatching(String[] words) {

        List<String> list = new ArrayList<>();

        String appendStr = "";

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
