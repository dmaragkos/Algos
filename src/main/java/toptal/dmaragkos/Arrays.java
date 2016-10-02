package toptal.dmaragkos;

public class Arrays {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int matchesOnWard = 0;
        int nonMatchesBackWard = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == X) {
                matchesOnWard++;
            }
        }

        for (int i = A.length - 1; i >= 0; i--) {
            if (matchesOnWard == nonMatchesBackWard) {
                return i + 1;
            }
            if (A[i] == X) {
                matchesOnWard--;
            } else {
                nonMatchesBackWard++;
            }
        }

        return 0;
    }
}
