import java.util.Scanner;

public class sumandav_arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=input.nextInt();
        int[] ar = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements of array: ");
            ar[i]=input.nextInt();

        }
        int sum=0;
         float avg;
       
        for(int i=0;i<size;i++){
            sum+=ar[i];
            

        }
        avg=(float)sum/(ar.length);
        System.out.println("Sum of an array is: "+sum);
        System.out.println("Average of an array is "+avg);
        
        
    }
    
}
