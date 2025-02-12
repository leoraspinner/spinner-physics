package spinner.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LocationTest {

    @Test
    public void apply() {
        // given - set variables
        Location originalLocation = new Location(7, 3);
        Force force = new Force(36.87, 5); // 5N at 36.87 degrees

        // when - apply the force
        Location newLocation = originalLocation.apply(force);

        // then - check results of test
        assertEquals(11, newLocation.getX(), 0.1);  // x should be approximately 11
        assertEquals(6, newLocation.getY(), 0.1);   // y should be approximately 6
    }
}