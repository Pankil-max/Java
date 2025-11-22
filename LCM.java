import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1=input.nextInt();
        System.out.println("Enter the second number: ");
        int n2=input.nextInt();
         System.out.println("LCM of "+n1+" and "+n2+" is: "+Lcm(n1, n2));
         
        
    }
    public static int  Lcm(int n1 , int n2) {
        int lcm=(n1>n2)? n1:n2;
        while(!(lcm%n1==0 && lcm%n2==0)){
            lcm++;
        }

        return lcm;
    }
    
}
