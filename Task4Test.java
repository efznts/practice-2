import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {
    @Test
    public void testOne() {
        assertEquals(3.0, Task4.powerSum(1), 0.0001);
    }

    @Test
    public void testTwo() {
        // 4 + 16 + 64 = 84
        assertEquals(84.0, Task4.powerSum(2), 0.0001);
    }

    @Test
    public void testNegative() {
        assertEquals(84.0, Task4.powerSum(-2), 0.0001);
    }
}
