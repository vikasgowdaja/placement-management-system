package day9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class MaxMinProductPrice {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 1500),
                new Product(2, "Phone", 800),
                new Product(

3, "Tablet", 400),
                new Product(4, "Headphones", 100)
        );

        // Finding max and min product price using Java Streams
        double maxPrice = products.stream()
                                  .mapToDouble(Product::getPrice)
                                  .max()
                                  .orElse(0);

        double minPrice = products.stream()
                                  .mapToDouble(Product::getPrice)
                                  .min()
                                  .orElse(0);

        System.out.println("Max Price: " + maxPrice); // Output: Max Price: 1500.0
        System.out.println("Min Price: " + minPrice); // Output: Min Price: 100.0
    }
}