package toptal.dmaragkos;

import java.util.ArrayList;
import java.util.List;

class Bits {
    public int[] solution(int[] A) {
        // write your code in Java SE 8
        int intValue = toInt(A);
        return fromInt(-intValue);
    }

    int toInt(int[] A) {
        int intRepresentation = 0;
        for (int i = 0; i < A.length; i++) {
            intRepresentation += A[i] * Math.pow(-2, i);
        }
        return intRepresentation;
    }

    int[] fromInt(int X) {
        final List<Integer> bits = new ArrayList<>();
        int rem;
        while (X != 0) {
            rem = X % -2;
            X = X / -2;
            if (rem < 0) {
                rem += 2;
                X += 1;
            }
            bits.add(rem);
        }
        return bits.stream().mapToInt(i -> i).toArray();
    }
}
