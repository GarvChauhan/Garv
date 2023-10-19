import java.util.Scanner;

class Reverse{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={3,2,4,6,7};
        int n=s.nextInt();
        int temp=n;
        int r=0;
        while(n!=0){
            r=r*10+n%10;
            n/=10;
        }
        System.out.println("REVERSE OF A NUMBER IS:"+r);
    }
}