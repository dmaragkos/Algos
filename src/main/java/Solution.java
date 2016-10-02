// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        final Set<Integer> set = new HashSet<Integer>();
        int position = 0;

        for (int i = 0; i < A.length; i++) {
            if (set.add(A[i])) {
                position = i;
            }
        }
        return position;
    }
}