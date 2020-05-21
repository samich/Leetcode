package Strings;

/**
 * 657. Robot Return to Origin
 *
 * There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its
 * moves, judge if this robot ends up at (0, 0) after it completes its moves.
 *
 * The move sequence is represented by a string, and the character moves[i] represents its ith move.
 * Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin
 * after it finishes all of its moves, return true. Otherwise, return false.
 *
 * Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the
 * right once, "L" will always make it move left, etc. Also, assume that the magnitude of the robot's
 * movement is the same for each move.
 *
 * */

public class Problem657 {
    public static void main(String[] args) {

        //example 1
        String s = "UD";
        System.out.println(judgeCircle(s));

        //example 2
        s = "LL";
        System.out.println(judgeCircle(s));
    }

    public static boolean judgeCircle(String moves) {

        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;

        for (int i = 0; i < moves.length(); i++) {

            if ( moves.charAt(i) == 'U') {
                up++;
            } else if ( moves.charAt(i) == 'D' ) {
                down++;
            } else if ( moves.charAt(i) == 'L' ) {
                left++;
            } else if ( moves.charAt(i) == 'R' ) {
                right++;
            }

        }

        return up == down && left == right;

    }

}
