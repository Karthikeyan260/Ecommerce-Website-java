
import java.util.Scanner;

public class Eco {
    private String productName;
    private double price;
    private int quantity;

    public Eco(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public double calculateDiscount(double discountPercentage) {
        return (price * quantity) * (discountPercentage / 100);
    }

    public double calculateTax(double taxPercentage) {
        return (price * quantity) * (taxPercentage / 100);
    }

    public double calculateNetCost(double discountPercentage, double taxPercentage) {
        return calculateTotalCost() - calculateDiscount(discountPercentage) + calculateTax(taxPercentage);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product 1 name: ");
        String productName1 = scanner.nextLine();
        System.out.print("Enter product 1 price: ");
        double price1 = scanner.nextDouble();
        System.out.print("Enter product 1 quantity: ");
        int quantity1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter product 2 name: ");
        String productName2 = scanner.nextLine();
        System.out.print("Enter product 2 price: ");
        double price2 = scanner.nextDouble();
        System.out.print("Enter product 2 quantity: ");
        int quantity2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter product 3 name: ");
        String productName3 = scanner.nextLine();
        System.out.print("Enter product 3 price: ");
        double price3 = scanner.nextDouble();
        System.out.print("Enter product 3 quantity: ");
        int quantity3 = scanner.nextInt();

        Eco product1 = new Eco(productName1, price1, quantity1);
        Eco product2 = new Eco(productName2, price2, quantity2);
        Eco product3 = new Eco(productName3, price3, quantity3);

        System.out.println("\nProduct 1:");
        System.out.println("Product Name: " + product1.getProductName());
        System.out.println("Price: " + product1.getPrice());
        System.out.println("Quantity: " + product1.getQuantity());
        System.out.println("Total Cost: " + product1.calculateTotalCost());
        System.out.println("Discount (10%): " + product1.calculateDiscount(10));
        System.out.println("Tax (8%): " + product1.calculateTax(8));
        System.out.println("Net Cost: " + product1.calculateNetCost(10, 8));

        System.out.println("\nProduct 2:");
        System.out.println("Product Name: " + product2.getProductName());
        System.out.println("Price: " + product2.getPrice());
        System.out.println("Quantity: " + product2.getQuantity());
        System.out.println("Total Cost: " + product2.calculateTotalCost());
        System.out.println("Discount (10%): " + product2.calculateDiscount(10));
        System.out.println("Tax (8%): " + product2.calculateTax(8));
        System.out.println("Net Cost: " + product2.calculateNetCost(10, 8));

        System.out.println("\nProduct 3:");
        System.out.println("Product Name: " + product3.getProductName());
        System.out.println("Price: " + product3.getPrice());
        System.out.println("Quantity: " + product3.getQuantity());
        System.out.println("Total Cost: " + product3.calculateTotalCost());
        System.out.println("Discount (10%): " + product3.calculateDiscount(10));
        System.out.println("Tax (8%): " + product3.calculateTax(8));
        System.out.println("Net Cost: " + product3.calculateNetCost(10, 8));
    }
}
