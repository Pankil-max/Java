import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=input.nextInt();
        
        if(rev(n)==n){
            System.out.println(n+" is Palindrome");
        }
        else{
            System.out.println(n+" is not Palindrome");
        }
        
    }
    public static int rev(int n) {
        int s=0;
        int r=0;
        while (n!=0) {
            r=n%10;
            s=s*10+r;
            n=n/10;

            
        }

        return s;
    }
    
}
