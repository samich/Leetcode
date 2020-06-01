package Arrays;

public class Problem1385 {

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 2, 3};
        int[] arr2 = {-4, -3, 6, 10, 20, 30};
        int d = 3;
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
