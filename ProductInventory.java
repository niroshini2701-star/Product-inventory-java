import java.util.*;
import java.util.Scanner;
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }

    static double calculateTotalCost(double... costs) {
        double total = 0;
        for (double c : costs) {
            total += c;
        }
        return total;
    }
}

class ElectronicProduct extends Product {
    String brand;

    ElectronicProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    void displayElectronicProduct() {
        displayProduct();
        System.out.println("Brand: " + brand);
    }
}

public class ProductInventory {
    public static void main(String[] args) {

        String[] productNames = {"Laptop", "Mobile", "Headphones"};

        ElectronicProduct p1 = new ElectronicProduct("Laptop", 60000, "Dell");
        ElectronicProduct p2 = new ElectronicProduct("Mobile", 25000, "Samsung");
        ElectronicProduct p3 = new ElectronicProduct("Headphones", 3000, "Sony");

        p1.displayElectronicProduct();
        System.out.println();

        p2.displayElectronicProduct();
        System.out.println();

        p3.displayElectronicProduct();
        System.out.println();

        double total = Product.calculateTotalCost(60000, 25000, 3000);

        System.out.println("Product List:");
        for(String p : productNames){
            System.out.println(p);
        }

        System.out.println("Total Cost: " + total);
    }
}