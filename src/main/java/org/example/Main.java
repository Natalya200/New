package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);
        Park park = new Park ("Орбита", "10:00-22:00", 500.4);

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);
        productsArray[1] = new Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);
        productsArray[2] = new Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);
        productsArray[3] = new Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);
        productsArray[4] = new Product("Телевизор", "10.09.2024", "Самсунг", "Китай", 2000.66, true);

        System.out.println(Arrays.toString(productsArray));
    }
}