public class MQnoTen {

    static class Car {
        String brand;
        String model;
        double price;

        public Car(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        public void displayCarDetails() {
            if (price > 2000000) {
                System.out.println("Brand: " + brand);
                System.out.println("Model: " + model);
                System.out.println("Price: " + price);
                System.out.println("--------------------");
            }
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X7", 9000000);
        Car car2 = new Car("Audi", "A6", 5500000);
        Car car3 = new Car("Mercedes", "S-Class", 2200000);
        Car car4 = new Car("Toyota", "Camry", 1800000);
        Car car5 = new Car("Lamborghini", "Aventador", 35000000);

        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();
        car4.displayCarDetails();
        car5.displayCarDetails();
    }
}
