import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {
    @Test
    public void testEnergy() {
        // 2 * 3 * 3 / 2 = 9
        assertEquals(9.0, Task5.kineticEnergy(2, 3), 0.0001);
    }

    @Test
    public void testZeroSpeed() {
        assertEquals(0.0, Task5.kineticEnergy(5, 0), 0.0001);
    }
}
