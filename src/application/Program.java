package application;

import model.entities.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = Arrays.asList(
                new Product("TV", 900.00),
                new Product("Notebook", 1200.00),
                new Product("Tablet", 450.00));

        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort(comp);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
