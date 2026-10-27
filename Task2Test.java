import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    @Test
    public void testZero() {
        assertEquals(0.0, Task2.sinDeg(0), 0.0001);
    }

    @Test
    public void testThirty() {
        assertEquals(0.5, Task2.sinDeg(30), 0.0001);
    }

    @Test
    public void testNinety() {
        assertEquals(1.0, Task2.sinDeg(90), 0.0001);
    }
}
