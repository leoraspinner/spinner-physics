package spinner.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceTest
{

    @Test
    public void add() {
        //given - set variables
        Force  a = new Force(32, 10);
        Force b = new Force(105, 10);


        //when - run
        //usually one line
        Force c = a.add(b);

        //then - check results of test
        assertEquals(68.5, c.getDegrees(), 0.1);
        assertEquals(16.08, c.getMagnitude(), 0.1);
    }

    @Test
    public void scale() {

        Force original = new Force(30, 15);

        Force scaled = original.scale(0.391);

        assertEquals(30, scaled.getDegrees());
        assertEquals(5.865, scaled.getMagnitude());
    }
}