import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        fib();

    }

    public static void fib() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num upto fib: ");
        int n=input.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int c;
        int i=3;
        while(i<=n){
            System.out.println(c=a+b);
            a=b;
            b=c;
            i++;

        }

    }

}
