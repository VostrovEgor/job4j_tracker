package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        Product product;
        for (int i = index; i < products.length - 1; i++) {
            product = products[i];
            products[i] = products[i + 1];
            products[i + 1] = product;
        }
        products[products.length - 1] = null;
        return products;
    }
}
