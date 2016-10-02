package toptal.dmaragkos;

import org.junit.Before;
import org.junit.Test;

public class KnightTourTest {

    private KnightTour knightTour;

    @Test
    public void should_work_for_example() {
        knightTour.solution(4, 5);
    }

    @Before
    public void setUp() {
        knightTour = new KnightTour();
    }
}
