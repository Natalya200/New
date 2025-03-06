package org.example;

public class Animal {
    String name;
    static int animalCount = 0; // Счетчик всех животных

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м");
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Статический метод для получения количества животных
    public static int getAnimalCount() {
        return animalCount;
    }
}
