package org.example;

public class Dog extends org.example.Animal {
    private static int dogCount = 0; // Счетчик собак

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(getName() + " пробежал " + distance + " м");
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " м (максимум 500 м)");
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(getName() + " проплыл " + distance + " м");
        } else {
            System.out.println(getName() + " не может проплыть " + distance + " м (максимум 10 м)");
        }
    }

    // Статический метод для получения количества собак
    public static int getDogCount() {
        return dogCount;
    }
}
