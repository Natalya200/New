import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestU {
    // Вычисление факториала
    @Test
    void testCalculateFactorial() {
        assertEquals(1, Les12.calculateFactorial(0));
        assertEquals(1, Les12.calculateFactorial(1));
        assertEquals(120, Les12.calculateFactorial(5));
    }

    @Test
    void testCalculateFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> Les12.calculateFactorial(-1));
    }

    // Площадь треугольника
    @Test
    void testCalculateTriangleArea() {
        assertEquals(10.0, Les12.calculateTriangleArea(5, 4));
        assertEquals(25.0, Les12.calculateTriangleArea(10, 5));
    }

    @Test
    void testCalculateTriangleAreaInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Les12.calculateTriangleArea(0, 4));
        assertThrows(IllegalArgumentException.class, () -> Les12.calculateTriangleArea(5, -1));
    }

    // Тесты для арифметических действий
    @Test
    void testAdd() {
        assertEquals(15, Les12.add(10, 5));
        assertEquals(-5, Les12.add(-10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, Les12.subtract(10, 5));
        assertEquals(-15, Les12.subtract(-10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, Les12.multiply(10, 5));
        assertEquals(-50, Les12.multiply(-10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, Les12.divide(10, 5));
        assertEquals(-2.0, Les12.divide(-10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Les12.divide(10, 0));
    }

    // Сравнение
    @Test
    void testCompareNumbers() {
        assertEquals("10 больше 5", Les12.compareNumbers(10, 5));
        assertEquals("3 меньше 7", Les12.compareNumbers(3, 7));
        assertEquals("4 равно 4", Les12.compareNumbers(4, 4));
    }
}
