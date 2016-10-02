package toptal.dmaragkos;

import org.junit.Before;
import org.junit.Test;
import toptal.dmaragkos.Bits;

import static org.assertj.core.api.Assertions.assertThat;

public class BitsTest {

    private Bits bits;

    @Test
    public void should_work_with_example() {
        int A[] = new int[]{1, 0, 0, 1, 1};
        int[] expected = {1, 1, 0, 1};

        int[] actual = bits.solution(A);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void should_work_with_bignumber() {
        int[] actual = bits.fromInt(100000);

        assertThat(actual).isNotNull();
    }

    @Test
    public void should_transform_int() {
        int A[] = new int[]{1, 0, 0, 1, 1};
        int B[] = new int[]{1, 1, 0, 1, 0, 1, 1};

        int actual1 = bits.toInt(A);
        int actual2 = bits.toInt(B);

        assertThat(actual1).isEqualTo(9);
        assertThat(actual2).isEqualTo(23);
    }

    @Test
    public void should_transform_from_int() {
        int expected1[] = new int[]{1, 0, 0, 1, 1};
        int expected2[] = new int[]{1, 1, 0, 1, 0, 1, 1};

        int[] actual1 = bits.fromInt(9);
        int[] actual2 = bits.fromInt(23);


        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Before
    public void setUp() {
        bits = new Bits();
    }
}
