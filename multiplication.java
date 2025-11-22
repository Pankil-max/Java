import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        mul(n);
        
        
    }
    public static void mul(int n) {
        int i=1;
        while(i<=10){
            System.out.println(n+" X"+i+"="+(n*i));
            i++;

        }

        
    }
    
}
