package Strings;

/**
 * 824. Goat Latin
 *
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase
 * and uppercase letters only.
 *
 * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
 *
 * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
 *
 * The rules of Goat Latin are as follows:
 *
 *     If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 *     For example, the word 'apple' becomes 'applema'.
 *
 *     If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
 *     For example, the word "goat" becomes "oatgma".
 *
 *     Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 *     For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
 *
 * Return the final sentence representing the conversion from S to Goat Latin.
 *
 * */

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
