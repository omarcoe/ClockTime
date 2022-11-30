

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ClockTimeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClockTimeTest
{
    private ClockTime clockTim1;
    private ClockTime clockTim2;

    /**
     * Default constructor for test class ClockTimeTest
     */
    public ClockTimeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        clockTim1 = new ClockTime();
        clockTim2 = new ClockTime();
        clockTim1.setHour(12);
        clockTim1.setMinute(00);
        clockTim1.setSecond(00);
        clockTim2.setHour(12);
        clockTim2.setMinute(00);
        clockTim2.setSecond(00);
        clockTim1.toString();
        clockTim2.toString();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testHour()
    {
        ClockTime clockTim1 = new ClockTime(12, 00, 00);
        assertEquals(12, clockTim1.getHour());
    }

    @Test
    public void testSeconds()
    {
        ClockTime clockTim1 = new ClockTime(12, 00, 30);
        clockTim1.setSecond(30);
        assertEquals(30, clockTim1.getSecond());
    }

    @Test
    public void testEquals()
    {
        clockTim1.equals(clockTim2);
    }

    @Test
    public void testtoString()
    {
        clockTim2.setHour(11);
        assertEquals("11:00:00", clockTim2.toString());
    }
}




