package Strings;

public class Problem1374 {

    public static void main(String[] args) {

        //example 1:
        int n = 4;
        System.out.println(generateTheString(n));

        //example 2:
        n = 2;
        System.out.println(generateTheString(n));

        //example 3:
        n = 7;
        System.out.println(generateTheString(n));
    }

    public static String generateTheString(int n) {

        String s = "";
        int a = 0;
        int b = 0;

        if ( n % 2 == 0) {

            a = n / 2 ;

            if ( a % 2 == 0 ) {

                a = (n / 2) - 1;
                b = (n / 2) + 1;

            } else {

                b = n / 2;

            }

        } else {

            a = n;

        }

        for (int i = 0; i < a; i++) {
            s += "a";
        }

        for (int i = 0; i < b; i++) {
            s += "b";
        }

        return s;

    }

}
