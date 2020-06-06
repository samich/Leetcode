import java.util.Arrays;

public class Stack {

    public static void main(String[] args) {

        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));

    }

    public static int largestRectangleArea(int[] heights) {

        int area = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int[] smallerToLeft = new int[heights.length];
        int[] smallerToRight = new int[heights.length];
        int[] width = new int[heights.length];

        //find the nearest smaller height to the right
        for ( int i = heights.length - 1; i >= 0; i-- ) {

            if ( stack.size() == 0 ) {
                //for the right most element there is no next element, so we set the element value larger
                smallerToRight[i] = heights.length;

            } else {

                while ( stack.size() > 0 && heights[stack.peek()] >= heights[i] ) {
                    stack.pop();
                }

                //if stack got empty by this point, that means there was no any smaller integer, so enter -1
                if ( stack.size() == 0 ) {

                    smallerToRight[i] = heights.length;

                } else {

                    smallerToRight[i] = stack.peek();

                }

            }

            stack.push(i);

        }

        //clear the stack before using it again
        stack.clear();

        //find the nearest smaller height to the left
        for ( int i = 0; i < heights.length; i++ ) {

            if ( stack.size() == 0 ) {

                smallerToLeft[0] = -1;

            } else {

                while ( stack.size() > 0 && heights[stack.peek()] >= heights[i] ) {
                    stack.pop();
                }

                //if stack got empty by this point, that means there was no any smaller integer, so enter -1
                if ( stack.size() == 0 ) {

                    smallerToLeft[i] = -1;

                } else {

                    smallerToLeft[i] = stack.peek();

                }

            }

            stack.push(i);

        }

        //find width for each building by subtracting each building's smaller to the left from the right
        for ( int i = 0; i < smallerToRight.length; i++ ) {

            width[i] = smallerToRight[i] - smallerToLeft[i] -1 ;

        }

        //now we have widths and heights for each building, calculate area for each
        for ( int i = 0; i < smallerToRight.length; i++ ) {

            int newArea = heights[i] * width[i];

            if ( newArea > area ) {
                area = newArea;
            }

        }

        return area;
    }
}
