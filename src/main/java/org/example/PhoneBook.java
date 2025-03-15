package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
       phoneBook.put(lastName, phoneNumber);
    }

    public String get(String lastName) {
        return phoneBook.get(lastName);
    }

    // Метод для отображения всех контактов
    public void displayContacts() {
        if (phoneBook.isEmpty()) {
            System.out.println("Справочник пуст.");
            return;
        }
        System.out.println("Телефонный справочник:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Номер телефона: " + entry.getValue());
        }
    }
}

