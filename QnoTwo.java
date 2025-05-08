public class QnoTwo {
   public int add(int a, int b) {
       return a + b;
   }

   public int subtract(int a, int b) {
       return a - b;
   }

   public int product(int a, int b) {
       return a * b;
   }

   public double quotient(int a, int b) {
       return (double) a / b;
   }

   public static void main(String[] args) {
       QnoTwo calc = new QnoTwo();
       int a = 5;
       int b = 10;

       int c = calc.add(a, b);
       System.out.println("Addition result: " + c);
   }
}
