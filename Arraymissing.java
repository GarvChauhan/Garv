public class Arraymissing {
    public static void main(String[] args) {
        int a[]={1,2,4,0,5};
        int n=a.length;
        // int n= Integer.MIN_VALUE;
        // for (int i = 0; i < a.length; i++) {
        //     if(n<a[i])
        //     n=a[i];
        // }
        int sum=n*(n+1)/2;
        int miss=0;
        for (int i = 0; i < a.length; i++) {
            miss+=a[i];
        }
        miss=sum-miss;
        System.out.println("MISSING NUMBER IS="+miss);
    }
}
