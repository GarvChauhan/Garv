public class Swap {
    public static void main(String[] args) {
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("AFter swap"+a +" "+b);


    }   
}
