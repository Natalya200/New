package org.example;

public class Product {
    String name;
    String data;
    String manufacturer;
    String countryOrigin;
    Double price;
    Boolean reservationStatus;

    public Product(String _name, String data, String manufacturer,
                   String countryOrigin, Double price, Boolean reservationStatus) {
        this.name = _name;
        this.data = data;
        this.manufacturer = manufacturer;
        this.countryOrigin = countryOrigin;
        this.price = price;
        this.reservationStatus = reservationStatus;
        System.out.println("название " + _name + " дата производства "
                + data + " производитель " + manufacturer + " страна происхождения "
                + countryOrigin + " цена " + price + " состояние бронирования покупателем " + reservationStatus);
    }
}
