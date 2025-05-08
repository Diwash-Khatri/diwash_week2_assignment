import java.util.Scanner;
public class QnoFive{
    public static void main(String[] args) {
      int age;
      
      System.out.println("Enter your age");
      java.util.Scanner scanner = new Scanner(System.in);
      age = scanner.nextInt();
      if (age > 18){
        System.out.println("You are eligile to vote");
      }else{ 
        System.out.println("You are not eligible to vote");
      }
      scanner.close();
    }
}
 