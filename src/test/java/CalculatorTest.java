import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;
        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtraction() {
        int expected = 0;
        int actual = calculator.subtract(1, 1);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 10;
        int actual = calculator.multiply(10, 1);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 15;
        int actual = calculator.divide(30, 2);

        assertEquals(expected, actual);
    }

}
