public class MQnoSeven {

    static class Product {
        String productName;
        double price;
        double discountPercentage;

        public Product(String productName, double price, double discountPercentage) {
            this.productName = productName;
            this.price = price;
            this.discountPercentage = discountPercentage;
        }

        public double calculateFinalPrice() {
            return price - (price * discountPercentage / 100);
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 800.00, 10);
        Product product2 = new Product("Smartphone", 500.00, 15);
        Product product3 = new Product("Headphones", 100.00, 20);

        System.out.println("Final Price of " + product1.productName + ": " + product1.calculateFinalPrice());
        System.out.println("Final Price of " + product2.productName + ": " + product2.calculateFinalPrice());
        System.out.println("Final Price of " + product3.productName + ": " + product3.calculateFinalPrice());
    }
}
