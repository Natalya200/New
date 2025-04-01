package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.Student.printStudents;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
phoneBook.add("Сидоров", "89273653423");
phoneBook.add("Иванов", "89279371745");
phoneBook.add("Васильев", "89175637382");

System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
System.out.println("Телефоны Васильева: " + phoneBook.get("Васильев"));

        // Создание коллекции студентов
        ArrayList<Object> students = new ArrayList<>();

        // Добавление студентов в коллекцию
        students.add(new Student("Иванов", "Группа A", 1, List.of(4, 5, 3)));
        students.add(new Student("Петров", "Группа B", 1, List.of(2, 3, 4)));
        students.add(new Student("Сидоров", "Группа A", 2, List.of(5, 5, 4)));
        students.add(new Student("Кузнецов", "Группа B", 2, List.of(1, 2, 3)));
        }

    }



