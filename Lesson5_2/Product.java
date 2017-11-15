package com.company.vector;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
