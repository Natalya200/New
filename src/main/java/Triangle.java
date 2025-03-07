import org.example.Shape;

public class Triangle implements Shape {
    double A; // Сторона A
    double B; // Сторона B
    double C; // Сторона C
    String fillColor; // Цвет заливки
    String borderColor; // Цвет границы

    public Triangle(double A, double B, double C, String fillColor, String borderColor) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return A + B + C; // Формула периметра треугольника
    }

    @Override
    public double getArea() {
        // Формула площади треугольника
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }

    @Override
    public void printInfo() {
        System.out.println("Треугольник:");
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
    }
}