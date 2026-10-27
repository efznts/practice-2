import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @Test
    public void testOneDigit() {
        assertEquals(1, Task3.digitCount(7));
        assertEquals(7, Task3.digitSum(7));
    }

    @Test
    public void testManyDigits() {
        assertEquals(4, Task3.digitCount(1234));
        assertEquals(10, Task3.digitSum(1234));
    }

    @Test
    public void testWithZeros() {
        assertEquals(4, Task3.digitCount(1005));
        assertEquals(6, Task3.digitSum(1005));
    }
}
