package Strings;

/**
 * 537. Complex Number Multiplication
 *
 *  Given two strings representing two complex numbers.
 *
 * You need to return a string representing their multiplication.
 * Note i2 = -1 according to the definition.
 *
 * Example 1:
 *
 * Input: "1+1i", "1+1i"
 * Output: "0+2i"
 * Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
 *
 * Example 2:
 *
 * Input: "1+-1i", "1+-1i"
 * Output: "0+-2i"
 * Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 *
 * */

public class Problem537 {

    public static void main(String[] args) {

        //example 1:
        String a = "1+-1i";
        String b = "1+-1i";
        System.out.println(complexNumberMultiply(a, b));

        //example 2:
        a = "5+2i";
        b = "4+-3i";
        System.out.println(complexNumberMultiply(a, b));

    }

    public static String complexNumberMultiply(String a, String b) {

        //parse string a into int a and b
        String[] arrA = a.split("[+]");
        String[] bParts = arrA[1].split("i");

        int intA = Integer.parseInt(arrA[0]);
        int intB = Integer.parseInt(bParts[0]);

        //parse string b into int c and d
        String[] arrB = b.split("[+]");
        String[] dParts = arrB[1].split("i");

        int intC = Integer.parseInt(arrB[0]);
        int intD = Integer.parseInt(dParts[0]);

        int calculate = (intA * intC) + (intB * intD)*(-1);
        int iPart = (intA * intD) + (intB * intC);

        return "" + calculate + "+" +iPart + "i";

    }




}
