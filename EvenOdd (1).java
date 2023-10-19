import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner  s =new Scanner(System.in);
        System.out.println("Enter any number");
        int n = s.nextInt();
        System.out.println((n%2==0)?"given number is Even":"given number is Odd");
     }
}
