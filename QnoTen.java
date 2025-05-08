public class QnoTen {
    String brand;
    int year;

    public QnoTen(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void showCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        QnoTen car1 = new QnoTen("Toyota", 2020);
        QnoTen car2 = new QnoTen("Honda", 2022);

        car1.showCarDetails();
        car2.showCarDetails();
    }
}
