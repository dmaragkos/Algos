import java.util.Arrays;
import java.util.Comparator;

class Discs {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long[][] intervals = new long[A.length][2];
        for (int i = 0; i < A.length; i++) {
            intervals[i][0] = (long) i - A[i];
            intervals[i][1] = (long) i + A[i];
        }
        Arrays.sort(intervals, new Comparator<long[]>() {
            public int compare(long[] a, long[] b) {
                return Long.compare(a[0], b[0]);
            }
        });
        System.out.println("Sorted ");
        printArray(intervals);
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result += findSub(intervals, intervals[i][1], i + 1);
            if (result > 10000000) {
                return -1;
            }
        }
        return result;
    }

    private void printArray(long[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            System.out.println("[" + intervals[i][0] + " , " + intervals[i][1] + "]");
        }
    }

    private int findSub(long[][] intervals, long time, int index) {
        int start = index;
        int end = intervals.length - 1;
        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (intervals[mid][0] <= time) {
                result += mid - start + 1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Result for " + time + " : " + result);
        return result;
    }
}