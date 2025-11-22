import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n = Prime();
        int i = 1;
        int c=0;
        while (i <= n) {
            if (n % i == 0) {
                c++;
                
            } 
            i++;

        }
        if(c==2){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is composite");
        }

    }

    public static int Prime() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        return n;
    }

}
