import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=input.nextInt();
        if(n==arm(n)){
            System.out.println(n+" is Armstrong");
        }
        else{
            System.out.println(n+"is not armstrong");
        }


    }
    public static int arm(int n) {
        int s=0;
        int c=0;
        int r;
        int a=n;
        while (n!=0) {
            c++;
            n=n/10;
            
        }
        while(a!=0){
            r=a%10;
            s=s+(int)Math.pow(r,c);
            a=a/10;


        }


        return s;
    }
    
}
