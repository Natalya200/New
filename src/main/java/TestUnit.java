import jdk.internal.jimage.ImageStrings;
import org.junit.Test;

import java.awt.geom.Area;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestUnit {

    @Test
    public void testCalculateFactorial() {
        assertEquals(1, Les12.calculateFactorial(0));
        assertEquals(1, Les12.calculateFactorial(1));
        assertEquals(120, Les12.calculateFactorial(5));
    }


    // Тесты для нахождения площади треугольника
    @Test
    public void testCalculateTriangleArea() {
        Les12 MathOperations = new Les12();
        assertEquals(10.0, Les12.calculateTriangleArea(5, 4));
        assertEquals(25.0, Les12.calculateTriangleArea(10, 5));
    }

    @Test
    public void testCalculateTriangleAreaInvalidInput() {
        Les12 MathOperations = new Les12();
        assertThrows(IllegalArgumentException.class, () -> MathOperations.calculateTriangleArea(0, 4));
        assertThrows(IllegalArgumentException.class, () -> MathOperations.calculateTriangleArea(5, -1));
    }

    // Тесты для арифметических действий
    @Test
    public void testAdd() {
        ImageStrings MathOperations = null;
        assertEquals(15, MathOperations.add(10, 5));
        assertEquals(-5, MathOperations.add(-10, 5));
    }

    @Test
    public void testSubtract() {
        Area MathOperations = new Area();
        assertEquals(5, MathOperations.subtract(10, 5));
        assertEquals(-15, MathOperations.subtract(-10, 5));
    }

    @Test
    public void testMultiply() {
        BigDecimal MathOperations = null;
        assertEquals(50, MathOperations.multiply(10, 5));
        assertEquals(-50, MathOperations.multiply(-10, 5));
    }

    @Test
    public void testDivide() {
        Les12 MathOperations = null;
        assertEquals(2.0, Les12.divide(10, 5));
        assertEquals(-2.0, Les12.divide(-10, 5));
    }

    @Test
    public void testDivideByZero() {
        Les12 MathOperations = null;
        assertThrows(ArithmeticException.class, () -> Les12.divide(10, 0));
    }

    // Тесты для сравнения чисел
    @Test
    public void testCompareNumbers() {
        Les12 MathOperations = null;
        assertEquals("10 больше 5", Les12.compareNumbers(10, 5));
        assertEquals("3 меньше 7", Les12.compareNumbers(3, 7));
        assertEquals("4 равно 4", Les12.compareNumbers(4, 4));
    }
}
