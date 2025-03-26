public class TestNG {
    // 1. Вычисление факториала числа
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 2. Площадь треугольника
    public static double calculateTriangleArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основание и высота должны быть положительными числами.");
        }
        return (base * height) / 2;
    }

    // 3. Арифметические действия с двумя целыми числами
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return (double) a / b;
    }

    // 4. Сравнение двух целых чисел
    public static String compareNumbers(int a, int b) {
        if (a > b) {
            return a + " больше " + b;
        } else if (a < b) {
            return a + " меньше " + b;
        } else {
            return a + " равно " + b;
        }

    }
}

