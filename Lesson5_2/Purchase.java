package com.company.vector;

import java.util.ArrayList;

public class Purchase {

    ArrayList<Product> products = new ArrayList<Product>();


    public void addProduct(Product product){
        products.add(product);
    }

    public void calculatePrice(){
        int sum = 0;

        for (Product pr:products
             ) {
            sum = sum + pr.getPrice();
        }

        System.out.println("The total price is " + sum);
    }


}
