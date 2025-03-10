package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {

            int value = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Исключение: " + e.getMessage());
            System.out.println("Выход за предел]!");
        }
    }
}