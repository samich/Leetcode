package Strings;

public class Problem557 {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {

        String[] words = s.split(" ");
        String reversed = "";

        for (String word : words) {

            char[] w = word.toCharArray();

            int left = 0;
            int right = w.length - 1;

            while (left <= right) {

                char temp = w[left];
                w[left] = w[right];
                w[right] = temp;

                left++;
                right--;
            }

            reversed += String.valueOf(w) + " ";

        }

        reversed = reversed.trim();

        return reversed;

    }


}
