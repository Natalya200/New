import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class BaseTest {
    // Тесты для вычисления факториала
    // Тесты для вычисления факториала
    @Test
    public void testCalculateFactorial() {
        assertEquals(1, TestNG.calculateFactorial(0));
        assertEquals(1, TestNG.calculateFactorial(1));
        assertEquals(120, TestNG.calculateFactorial(5));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorialNegative() {
        TestNG.calculateFactorial(-1);
    }

    // Тесты для нахождения площади треугольника
    @Test
    public void testCalculateTriangleArea() {
        assertEquals(10.0, TestNG.calculateTriangleArea(5, 4));
        assertEquals(25.0, TestNG.calculateTriangleArea(10, 5));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateTriangleAreaInvalidInput() {
        TestNG.calculateTriangleArea(0, 4);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateTriangleAreaNegativeHeight() {
        TestNG.calculateTriangleArea(5, -1);
    }

    // Тесты для арифметических действий
    @Test
    public void testAdd() {
        assertEquals(15, TestNG.add(10, 5));
        assertEquals(-5, TestNG.add(-10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, TestNG.subtract(10, 5));
        assertEquals(-15, TestNG.subtract(-10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, TestNG.multiply(10, 5));
        assertEquals(-50, TestNG.multiply(-10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, TestNG.divide(10, 5));
        assertEquals(-2.0, TestNG.divide(-10, 5));
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        TestNG.divide(10, 0);
    }

    // Тесты для сравнения чисел
    @Test
    public void testCompareNumbers() {
        assertEquals("10 больше 5", TestNG.compareNumbers(10, 5));
        assertEquals("3 меньше 7", TestNG.compareNumbers(3, 7));
        assertEquals("4 равно 4", TestNG.compareNumbers(4, 4));
    }
}
