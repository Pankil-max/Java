import java.util.Scanner;

public class Sum_odd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        System.out.println("Sum of odd numbers is: "+sum_odd(n));

        
    }
    public static int sum_odd(int n ) {
        int i=1;
        int s=0;
        while(i<=n){
            s+=i;
            i+=2;

        }
        return s;
    }

}

