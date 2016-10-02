import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by a604592 on 9/25/2016.
 */
public class ArraysTest {

    private Arrays solution;

    @Test
    public void should_work_for_example() {
        int[] A = new int[]{5, 5, 1, 7, 2, 3, 5};

        int actual = this.solution.solution(5, A);

        System.out.println(actual);
        Assert.assertTrue(actual == 4);

    }

    @Before
    public void setUp() {
        solution = new Arrays();
    }
}
