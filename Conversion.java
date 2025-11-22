import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter degree in fahrenheit: ");
        float f=input.nextFloat();
        float c=(f-32)*5/9;
        System.out.println(c);
    }
    
}
