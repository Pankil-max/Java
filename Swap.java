
import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int a =input.nextInt();
        System.out.println("Enter 2nd no: ");
        int b= input.nextInt();
        int c=a;
        a=b;
        b=c;
       
        System.out.println("After swapping a="+a+" b="+b);
        

    }
}