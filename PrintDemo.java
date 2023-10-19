//public is a scope.
//JRE is install in some other drive then the drive in which i am writing the code.
//to compile code into byte code javac./<name of the file>.java
//to genrate machine code from byte code we have a command - java <name of byte code file>.

public class PrintDemo {
    public static void main(String[] args) {
        //Mian mrthod is the entry point of every java program . its presence is imp. when JRE is executing the code.
        //Void does not return anything , when JRE calls this main method  it does not return anything.
        //main is the name of the method.
        //string[] args are the command line arguments.


        System.out.println("     *    ");
        System.out.println("   *   *  ");
        System.out.println("  * * * * ");
        System.out.println(" *       *");
        System.out.println("*         *");


        System.out.println();
        System.out.println();
        System.out.println("*      *");
        System.out.println("* *  * *");
        System.out.println("*   *  *");
        System.out.println("*      *");
        System.out.println("*      *");

        System.out.println();
        System.out.println();
        System.out.println("*      *");
        System.out.println("* *    *");
        System.out.println("*   *  *");
        System.out.println("*    * *");


        System.out.println();  
        System.out.println(); 
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.print("* * * * *");

        main();
    }

    //overloaded method - methods having same name by diffrent signature(param list).
    public static void main(int[] arg){
        //user defined overloaded main method.
        int sum=0;
        sum=arg[0]+arrg[1];
        System.out.println(sum);
    }
    
}
