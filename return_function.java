import java.util.Scanner;

public class return_function {
    public static void main(String[] args) {
        int n1=read();
        int n2=read();
        int sum = n1+n2;
        System.out.println(sum);
        
        
        
    }

    public static int read() {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a no: ");
        int x= input.nextInt();
        return x;
        
    }
    
}
