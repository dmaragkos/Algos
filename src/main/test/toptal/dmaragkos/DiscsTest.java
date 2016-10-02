package toptal.dmaragkos;

import org.junit.Before;
import org.junit.Test;
import toptal.dmaragkos.Discs;

import static org.junit.Assert.assertTrue;

/**
 * Created by a604592 on 9/24/2016.
 */
public class DiscsTest {

    private Discs discs;

    @Test
    public void should_work_with_example() {
        int[] A = new int[]{1, 5, 2, 1, 4, 0};

        int actual = discs.solution(A);

        System.out.println(actual);

        assertTrue(actual == 11);
    }

    @Before
    public void setUp() {
        discs = new Discs();
    }
}
