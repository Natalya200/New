package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        org.example.Product product = new org.example.Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);
        org.example.Park park = new org.example.Park("Орбита", "10:00-22:00", 500.4);

        org.example.Product[] productsArray = new org.example.Product[5];
        productsArray[0] = new org.example.Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);
        productsArray[1] = new org.example.Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);
        productsArray[2] = new org.example.Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);
        productsArray[3] = new org.example.Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);
        productsArray[4] = new org.example.Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);

        System.out.println(Arrays.toString(productsArray));
    }
}