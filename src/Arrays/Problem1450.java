package Arrays;

public class Problem1450 {
    public static void main(String[] args) {

        //example 1:
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        int queryTime = 4;
        System.out.println(busyStudent( startTime, endTime, queryTime ));

        //example 2:
        startTime = new int[] {4};
        endTime = new int[] {4};
        queryTime = 4;
        System.out.println(busyStudent( startTime, endTime, queryTime ));

        //example 3:
        startTime = new int[] {4};
        endTime = new int[] {4};
        queryTime = 5;
        System.out.println(busyStudent( startTime, endTime, queryTime ));

        //example 4:
        startTime = new int[] {1, 1, 1, 1};
        endTime = new int[] {1, 3, 2, 4};
        queryTime = 7;
        System.out.println(busyStudent( startTime, endTime, queryTime ));

        //example 5:
        startTime = new int[] {9,8,7,6,5,4,3,2,1};
        endTime = new int[] {10,10,10,10,10,10,10,10,10};
        queryTime = 5;
        System.out.println(busyStudent( startTime, endTime, queryTime ));

    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int count = 0;

        for ( int i = 0; i < startTime.length; i++ ) {

            if ( queryTime >= startTime[i] && queryTime <= endTime[i] ) {
                count++;
            }
        }

        return count;

    }
}
