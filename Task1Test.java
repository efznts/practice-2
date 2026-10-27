import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    @Test
    public void testZero() {
        assertEquals(1.0, Task1.exp(0, 5), 0.0001);
    }

    @Test
    public void testOne() {
        // 1 + 1 + 1/2 + 1/6
        assertEquals(2.6667, Task1.exp(1, 3), 0.0001);
    }
}
