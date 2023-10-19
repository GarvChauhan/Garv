import java.util.Scanner;

public class Gratest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 no.");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int g= a > b ? ( a > c ? a : c) : (b > c ? b : c) ;
        System.out.println(g+"is gratest");
    }
    
}
