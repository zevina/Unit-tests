package task1.Shop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShopTest {
    private Shop shop;
    private Product prod1;
    private Product prod2;
    private Product prod3;

    /*
   1. ????? Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
        (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    @BeforeEach
    void init() {
        prod1 = new Product(1100, "Table");
        prod2 = new Product(500, "Chair");
        prod3 = new Product(900, "Laptop");

        List<Product> prods = new ArrayList<>();
        prods.add(prod1);
        prods.add(prod2);
        prods.add(prod3);
        shop = new Shop(prods);
    }

    @AfterEach
    void cleanup() {
        shop = null;
        prod1 = null;
        prod2 = null;
        prod3 = null;
    }


    @Test
    @DisplayName("Самый дорогой продукт")
    void testExpensive() {
        Product expensiveProd = shop.getMostExpensiveProduct();
//        System.out.println("Самый дорогой продукт:" + expensiveProd.getTitle() + " " + expensiveProd.getCost());
        assertEquals(prod1, expensiveProd, "most expensive product is prod1");
    }

    @Test
    @DisplayName("Правильность сортировки")
    void testSort() {
        shop.sortProductsByPrice();
        Boolean isSorted = true;
        List<Product> productList = shop.getProducts();
//        for (Product prod: productList) {
//            System.out.println(prod.getCost());
//        }
        for (int i = 0; i < productList.size()-1; i++) {
            if (productList.get(i).getCost() > productList.get(i + 1).getCost()) {
                isSorted = false;
            }
        }
        assertTrue(isSorted, "List doesn't sorted right way");
    }
}