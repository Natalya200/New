package org.example;

public class Circle implements  Shape {
    double radius; // Радиус круга
    String fillColor; // Цвет заливки
    String borderColor; // Цвет границы

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Формула периметра круга
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Формула площади круга
    }

    @Override
    public void printInfo() {
        System.out.println("Круг:");
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
    }
}

    @Override
    public void printInfo() {
        System.out.println("Круг:");
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
    }
}
