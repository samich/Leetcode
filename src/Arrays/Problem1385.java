package Arrays;

/**
 * 1385. Find the Distance Value Between Two Arrays
 *
 * Given two integer arrays arr1 and arr2, and the integer d, return the
 * distance value between the two arrays.
 *
 * The distance value is defined as the number of elements arr1[i] such that
 * there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
 *
 *
*/

public class Problem1385 {

    public static void main(String[] args) {

        //example 1:
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
        System.out.println( findTheDistanceValue( arr1, arr2, d) );

        //example 2:
        arr1 = new int[] {1, 4, 2, 3};
        arr2 = new int[] {-4, -3, 6, 10, 20, 30};
        d = 3;
        System.out.println( findTheDistanceValue( arr1, arr2, d) );

        //example 3:
        arr1 = new int[] {2, 1, 100, 3};
        arr2 = new int[] {-5, -2, 10, -3, 7};
        d = 6;
        System.out.println( findTheDistanceValue( arr1, arr2, d) );

    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {

            boolean isValid = true;

            for (int j = 0; j < arr2.length; j++) {

                if ( Math.abs( arr1[i] - arr2[j] ) <= d ) {
                    isValid = false;
                    break;
                }

            }

            if (isValid) {
                count++;
            }

        }

        return count;

    }

}
