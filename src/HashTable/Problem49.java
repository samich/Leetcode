package HashTable;

import java.util.*;

/**
 * 49. Group Anagrams
 *
 * Given an array of strings, group anagrams together.
 *
 * */

public class Problem49 {

    public static void main(String[] args) {

        //example 1:
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs).toString());

    }

    private static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for ( String s: strs ) {

            char[] chArr = s.toCharArray();

            Arrays.sort(chArr);

            String sorted = new String(chArr);

            if ( !map.containsKey(sorted) ) {
                map.put(sorted, new LinkedList<>());
            }

            map.get(sorted).add(s);
        }

        return new LinkedList<>( map.values() );

    }




}
