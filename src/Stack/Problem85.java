package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Problem85 {

    public static void main(String[] args) {

        //example 1:
        char[][] matrix = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        System.out.println(maximalRectangle(matrix));

        //example 2:
        char[][] matrix1 = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'},
                {'1', '0', '0', '1', '0'},
                {'1', '0', '0', '1', '0'},
                {'1', '0', '0', '1', '0'}
        };
        System.out.println(maximalRectangle(matrix1));

    }

    public static int maximalRectangle(char[][] matrix) {

        if ( matrix.length == 0 ) {
            return 0;
        }

        int[] areas = new int[matrix.length];
        int[] arrSum = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++){

                if ( matrix[i][j] == '0' ) {

                    arrSum[j] = 0;

                } else {

                    arrSum[j] = arrSum[j] + matrix[i][j] - 48; //because its character '0' is 48
                }

            }


            //store area of each row
            areas[i] = maxArea(arrSum);
        }

        //now we have all areas, get the highest one

        int max = 0;

        for ( int i = 0; i < areas.length; i++ ) {

            if ( areas[i] > max ) {

                max = areas[i];

            }

        }

        return max;

    }

    public static int maxArea( int[] arr ) {

        int max = 0;

        int[] smallerToLeft = new int[arr.length];
        int[] smallerToRight = new int[arr.length];
        int[] widths = new int[arr.length];
        Stack<Integer> stack = new Stack<>();


        for ( int i = 0; i < arr.length; i++ ) {

            if ( stack.empty() ) {

                smallerToLeft[i] = -1;

            } else {

                while ( stack.size() > 0 && arr[stack.peek()] >= arr[i] ) {

                    stack.pop();

                }

                if ( stack.size() == 0 ) {

                    smallerToLeft[i] = -1;

                } else {

                    smallerToLeft[i] = stack.peek();

                }

            }

            stack.push(i);

        }

        stack.clear();

        for ( int i = arr.length - 1; i >= 0; i-- ) {

            if ( stack.empty() ) {

                smallerToRight[i] = arr.length;

            } else {

                while ( stack.size() > 0 && arr[stack.peek()] >= arr[i] ) {

                    stack.pop();

                }

                if ( stack.size() == 0 ) {

                    smallerToRight[i] = arr.length;

                } else {

                    smallerToRight[i] = stack.peek();

                }

            }

            stack.push(i);

        }

        for ( int i = 0; i < smallerToRight.length; i++ ) {

            widths[i] = smallerToRight[i] - smallerToLeft[i] - 1;

        }

        for ( int i = 0; i < arr.length; i++ ) {

            if ( arr[i] * widths[i] > max ) {

                max = arr[i] * widths[i];

            }

        }

        return max;

    }


}
