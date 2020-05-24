package Strings;

public class Problem824 {
    public static void main(String[] args) {

        //example 1:
        String s = "I speak Goat Latin";
        System.out.println(toGoatLatin(s));

        //example 2:
        s = "The quick brown fox jumped over the lazy dog";
        System.out.println(toGoatLatin(s));

    }

    public static String toGoatLatin(String S) {

        String[] words = S.split(" ");
        String newString = "";

        int i = 1;

        for (String word : words ) {

            StringBuilder newWord = new StringBuilder(word);

            char firstChar = word.toLowerCase().charAt(0);

            if ( firstChar != 'a' && firstChar != 'e' && firstChar != 'i' && firstChar != 'o' && firstChar != 'u' ) {

                newWord.deleteCharAt(0).append(word.charAt(0));
            }

            String letters = "ma";

            for (int j = 0; j < i; j++) {
                letters += 'a';
            }

            newWord.append(letters);

            i++;

            newString += newWord + " ";

        }

        return newString.trim();

    }

}
