package org.example;

public class Park {
    String name;
    String time;
    Double price;

    public Park (String name, String time, Double price) {
        this.name = name;
        this.time = time;
        this.price = price;
        System.out.println("название " + name + " время работы "
                + time + " стоимость " + price );
    }
}
bfcb c