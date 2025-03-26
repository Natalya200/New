import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertEquals;

public class BaseTest {
    // Тесты для вычисления факториала
    // Тесты для вычисления факториала
    @Test
    public void testCalculateFactorial() {
        assertEquals(1, MathOperations.calculateFactorial(0));
        assertEquals(1, MathOperations.calculateFactorial(1));
        assertEquals(120, MathOperations.calculateFactorial(5));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorialNegative() {
        MathOperations.calculateFactorial(-1);
    }

    // Тесты для нахождения площади треугольника
    @Test
    public void testCalculateTriangleArea() {
        assertEquals(10.0, MathOperations.calculateTriangleArea(5, 4));
        assertEquals(25.0, MathOperations.calculateTriangleArea(10, 5));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateTriangleAreaInvalidInput() {
        MathOperations.calculateTriangleArea(0, 4);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateTriangleAreaNegativeHeight() {
        MathOperations.calculateTriangleArea(5, -1);
    }

    // Тесты для арифметических действий
    @Test
    public void testAdd() {
        assertEquals(15, MathOperations.add(10, 5));
        assertEquals(-5, MathOperations.add(-10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, MathOperations.subtract(10, 5));
        assertEquals(-15, MathOperations.subtract(-10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, MathOperations.multiply(10, 5));
        assertEquals(-50, MathOperations.multiply(-10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, MathOperations.divide(10, 5));
        assertEquals(-2.0, MathOperations.divide(-10, 5));
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        MathOperations.divide(10, 0);
    }

    // Тесты для сравнения чисел
    @Test
    public void testCompareNumbers() {
        assertEquals("10 больше 5", MathOperations.compareNumbers(10, 5));
        assertEquals("3 меньше 7", MathOperations.compareNumbers(3, 7));
        assertEquals("4 равно 4", MathOperations.compareNumbers(4, 4));
    }
}
