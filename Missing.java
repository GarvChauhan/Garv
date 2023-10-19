class Missing {

    public  static void main (String[] args){
        int[] arr = {3,2,4,6,7};
        int min = arr[0];
        for (int i=1; i < arr.length; i++){
            if (min > arr[i])
            min = arr[i];
        }
    }

    int totalSum= n*(n+1)/2;
for (int i =0;i<arr.length; i++){
    sum+= arr[i];
}
int missing = totalSum - sum;
System.out.println("The missing number is"+missing);
}
