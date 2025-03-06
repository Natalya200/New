package org.example;

public class Cat extends Animal {
    static int catCount = 0; // Счетчик котов
    boolean isFull; // Сытость кота

    public Cat(String name) {
        super(name);
        catCount++;
        isFull = false; // Кот голоден при создании
    }

    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " пробежал " + distance + " м");
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " м (максимум 200 м)");
        }
    }

    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать");
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}
