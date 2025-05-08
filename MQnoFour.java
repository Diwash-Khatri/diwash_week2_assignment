public class MQnoFour {

    static class Rectangle {
        double length;
        double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double calculateArea() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(7.5, 4.0);
        Rectangle rect3 = new Rectangle(6.0, 2.5);

        System.out.println("Area of Rectangle 1: " + rect1.calculateArea());
        System.out.println("Area of Rectangle 2: " + rect2.calculateArea());
        System.out.println("Area of Rectangle 3: " + rect3.calculateArea());
    }
}
