import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1=input.nextInt();
        System.out.println("Enter the second number: ");
        int n2=input.nextInt();
        System.out.println("GCD of "+n1+" and "+n2+" is: "+Gcd(n1, n2));


        
    }
    public static int Gcd(int n1 , int n2) {
        int gcd= (n1<n2)?n1:n2;
        while (!(n1%gcd==0&&n2%gcd==0)) {
            gcd--;
            
        }

        return gcd;
        
    }
    
}
