package Stack;

import java.util.Stack;

public class Problem42 {

    public static void main(String[] args) {

        //example 1:
        int[] height = {3, 0, 0, 2, 0, 4};
        System.out.println( trappingWater(height) );

        //example 2:
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println( trappingWater(height1) );

    }

    public static int trappingWater( int[] height) {

        if ( height.length == 0 ) {
            return 0;
        }

        int total = 0;
        int[] largestToLeft = new int[height.length];
        int[] largestToRight = new int[height.length];
        int[] min = new int[height.length];

        Stack<Integer> stack = new Stack<>();

        //find largest to the left for each building
        int max = height[0];

        for ( int i = 0; i < height.length; i++ ) {

            if ( stack.size() == 0 ) {

                largestToLeft[0] = height[0];

            } else {

                if ( height[i] > max ) {

                    largestToLeft[i] = height[i];
                    max = height[i];

                } else {

                    while ( stack.size() > 0 && stack.peek() <= max ) {

                        stack.pop();

                    }

                    if ( stack.size() == 0 ) {

                        largestToLeft[i] = max;

                    } else {

                        largestToLeft[i] = stack.peek();

                    }

                }

            }

            stack.push( height[i] );

        }

        stack.clear();



        //find largest to the right for each building
        max = height[ height.length - 1 ];

        for ( int i = height.length - 1 ; i >= 0; i-- ) {

            if ( stack.size() == 0 ) {

                largestToRight[height.length - 1] = height[ height.length - 1 ];

            } else {

                if ( height[i] > max ) {

                    largestToRight[i] = height[i];
                    max = height[i];

                } else {

                    while ( stack.size() > 0 && stack.peek() <= max ) {

                        stack.pop();

                    }

                    if ( stack.size() == 0 ) {

                        largestToRight[i] = max;

                    } else {

                        largestToRight[i] = stack.peek();

                    }

                }

            }

            stack.push( height[i] );

        }

        /* as we want to calculate the units where the water will gather
           so we find the minimum of left and right (because that's how water
           will flow), and subtract the building height from it, and add all units */
        for ( int i = 0; i < height.length; i++ ) {

            total += Integer.min( largestToLeft[i], largestToRight[i] ) - height[i];

        }

        return total;
    }

}
