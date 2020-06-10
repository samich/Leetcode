package HashTable;

import java.util.*;

public class Problem49 {

    public static void main(String[] args) {



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
