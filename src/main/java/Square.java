package org.example;

public class Square implements Shape {
    double a; // длина
    double b; // ширина
    String fillColor; // Цвет заливки
    String borderColor; // Цвет границы
    public Square(double a, double b, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return 2 * (a + b); // Формула периметра прямоугольника
    }

    public double getArea() {
        return a * b; // Формула площади прямоугольника
    }
    public void printInfo() {
        System.out.println("Прямоугольник:");
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
    }
}
