import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int n=s.nextInt();
        int sum=0;
        String b=String(n);
        for(int i=0;i<b.length;i++)
        {
            sum+=Integer.parseInt(b[i]);
        }

    }
}
