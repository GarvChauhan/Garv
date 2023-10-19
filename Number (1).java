import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any value");
        int a=s.nextInt();
        System.out.println((a>0)?(a==0?"zero":"positive"):"negative");
    }
    
}
