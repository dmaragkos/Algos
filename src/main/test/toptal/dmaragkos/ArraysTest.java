package toptal.dmaragkos;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysTest {

    private Arrays solution;

    @Test
    public void should_work_for_example() {
        int[] A = new int[]{5, 5, 1, 7, 2, 3, 5};

        int actual = solution.solution(5, A);

        assertThat(actual).isEqualTo(4);
    }

    @Test
    public void should_work_for_empty_array() {
        int[] A = new int[]{};

        int actual = solution.solution(5, A);

        assertThat(actual).isEqualTo(0);
    }

    @Test
    public void should_work_for_big_numbers() {
        int[] A = new int[]{50000, 50000, 100000, 70000, 20000, 30000, 50000};

        int actual = solution.solution(50000, A);

        assertThat(actual).isEqualTo(4);
    }

    @Before
    public void setUp() {
        solution = new Arrays();
    }
}
