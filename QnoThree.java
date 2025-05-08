import java.util.Scanner;
public class QnoThree {
    public static void main(String[] args) {
      int num;
      
      System.out.println("Enter a number");
      java.util.Scanner scanner = new Scanner(System.in);
      num = scanner.nextInt();
      if (num % 2 == 0){
        System.out.println("The number is even.");
      }else{
        System.out.println("The number is odd.");
      }
      scanner.close();
    }
}
