import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        System.out.println(sum(n));
        
    }
    public static int sum(int n){
        int s=0;
        int r;
        while (n!=0) {
            r=n%10;
            s=s+r;
            n=n/10;

            
        }

        return s;
    }
    
}
