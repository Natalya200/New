package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        org.example.Shape circle = new Circle(5, "Красный", "Черный");

        System.out.println("Круг:");
        circle.printInfo();

        {
            org.example.Dog dog1 = new org.example.Dog("Бобик");
            org.example.Cat cat1 = new org.example.Cat("Мурка");
            org.example.Cat cat2 = new org.example.Cat("Умка");

            dog1.run(150);
            dog1.swim(5);

            cat1.run(100);

            System.out.println("Общее количество животных: " + org.example.Animal.getAnimalCount());
            System.out.println("Количество котов: " + org.example.Cat.getCatCount());
        }
    }

    }
    bbxfb