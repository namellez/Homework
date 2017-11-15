package com.company.vector;

public class Main {

    public static void main(String[] args) {


        Purchase purchase = new Purchase();
        purchase.addProduct(new Product("Milk", 5));
        purchase.addProduct(new Product("Bread", 7));
        purchase.addProduct(new Product("Meat", 55));
        purchase.addProduct(new Product("Water", 10));

        purchase.calculatePrice();

    }
}


    //Создать класс Payment (покупка), сформируйте покупку из нескольких товаров.