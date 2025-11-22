import java.util.Scanner;

public class check {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a =input.nextInt();

        if(a>0){
            System.out.println(a+" is positive");
        }
        else if(a<0){
            System.out.println(a+" is negative");
        }
        else{
            System.out.println(a+" is 0");
        }
        
    }
}
