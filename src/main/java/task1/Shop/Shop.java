package task1.Shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.getCost() - product2.getCost();
            }
        });
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        if (products.isEmpty()) {
            throw new IllegalStateException("Shop is empty!");
        }

        Product mostExpensiveProduct = products.get(0);
        for (Product product : products) {
            if (product.getCost() > mostExpensiveProduct.getCost()) {
                mostExpensiveProduct = product;
            }
        }
        return mostExpensiveProduct;
    }

}