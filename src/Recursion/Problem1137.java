package Recursion;

/**
 * 1137. N-th Tribonacci Number
 *
 * The Tribonacci sequence Tn is defined as follows:
 *
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 * Given n, return the value of Tn.
 *
 *  (note: this solution uses iteration, do the same question using iteration)
 *
 * */

public class Problem1137 {

    public static void main(String[] args) {

        int n = 35;

        long start = System.currentTimeMillis();
        System.out.println(tribonacci(n));
        long end = System.currentTimeMillis();

        System.out.println("time in millisecons: " + (end - start));

    }

    public static int tribonacci(int n) {

        if (n == 0 ){
            return 0;
        }

        if (n == 1 || n ==2 ){
            return 1;
        }

        int[] num = new int[n+1];

        num[0] = 0;
        num[1] = 1;
        num[2] = 1;

        for (int i = 3; i <= n; i++) {
            num[i] = num[i - 3] + num[i - 2] + num[i - 1];
        }

        return num[n];

    }


}
