import java.util.Scanner;

public class Pal_Array {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=input.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements of an array: ");
            arr[i]=input.nextInt();

            
        }
        if(pal(arr, size)==true)
            {
                System.out.println("Palindrome");

        }
        else{
            System.out.println("Not Palindrome");

        }

    }
    public static boolean pal(int arr[],int size){
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]!=arr[arr.length-i-1]){
                return false;
            }
            
        }

        return true;
    }

    
}
