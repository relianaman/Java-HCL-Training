import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    String category;
    double price;

    Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class test3 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("PC", "Electronics", 60000),
            new Product("Mobile", "Electronics", 30000),
            new Product("T-shirt", "Clothing", 1500),
            new Product("Pent", "Clothing", 2500)
        );

        Map<String, Double> obj = products.stream()
            .collect(Collectors.groupingBy(
                Product::getCategory,
                Collectors.averagingDouble(Product::getPrice)
            ));

        System.out.println(obj);
    }
}