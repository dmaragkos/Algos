import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by a604592 on 9/25/2016.
 */
public class BitsTest {

    private Bits bits;

    @Test
    public void should_work_with_example() {
        int A[] = new int[]{1, 0, 0, 1, 1};

        int[] actual = bits.solution(A);

        Assert.assertArrayEquals(new int[]{1, 1, 0, 1}, actual);
    }

    @Test
    public void should_work_with_bignumber() {
        int A[] = new int[]{1, 0, 0, 1, 1};

        int[] actual = bits.fromInt(100000);

        Assert.assertArrayEquals(new int[]{1, 1, 0, 1}, actual);
    }

    @Test
    public void should_transform_int() {
        int A[] = new int[]{1, 0, 0, 1, 1};
        int B[] = new int[]{1, 1, 0, 1, 0, 1, 1};

        int actual1 = bits.toInt(A);
        int actual2 = bits.toInt(B);

        Assert.assertEquals(9, actual1);
        Assert.assertEquals(23, actual2);
    }

    @Test
    public void should_transform_from_int() {
        int expected1[] = new int[]{1, 0, 0, 1, 1};
        int expected2[] = new int[]{1, 1, 0, 1, 0, 1, 1};

        int[] actual1 = bits.fromInt(9);
        int[] actual2 = bits.fromInt(23);

//        for (int i : actual1) {
//            System.out.println(i);
//        }
//        for (int i : actual2) {
//            System.out.println(i);
//        }
    }

    @Before
    public void setUp() {
        bits = new Bits();
    }
}
