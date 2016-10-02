package toptal.dmaragkos;

import org.junit.Before;
import org.junit.Test;
import toptal.dmaragkos.Solution;

import static org.junit.Assert.assertTrue;

/**
 * Created by a604592 on 9/24/2016.
 */
public class SolutionTest {

    private Solution solution;

    @Test
    public void should_work_for_simple_array_with_covering_prefix() {
        int A[] = new int[]{2, 2, 1, 0, 1};

        int actual = solution.solution(A);

        assertTrue(actual == 3);
    }

    @Test
    public void should_work_for_empty_array() {
        assertTrue(solution.solution(new int[]{}) == 0);
    }

    @Test
    public void should_work_for_simple_array_without_covering_prefix() {
        int A[] = new int[]{2, 2, 1};

        int actual = solution.solution(A);

        assertTrue(actual == 2);
    }

    @Test
    public void should_work_for_simple_array_with_min_covering_prefix() {
        int A[] = new int[]{2, 2, 2};

        int actual = solution.solution(A);

        assertTrue(actual == 0);
    }

    @Test
    public void should_work_for_simple_array_with_large_numbers() {
        int A[] = new int[]{2, 1000000, 2};

        int actual = solution.solution(A);

        assertTrue(actual == 1);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }
}
