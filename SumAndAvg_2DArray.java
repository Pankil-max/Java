import java.util.Scanner;

public class SumAndAvg_2DArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       
        System.out.println("Enter no of rows: ");
        int rows=input.nextInt();
        System.out.println("Enter no of columns: ");
        int cols=input.nextInt();
        int arr[][] = new int[rows][cols];

               for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter Elements: ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Your sum of array is: " + sum(arr));
        System.out.println("Your average of array is: " + avg(arr,rows,cols));


        
    }
    public static int sum(int arr[][]){
        int Sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                Sum+=arr[i][j];
                
            }
            
        }

        return Sum;
    }
    public static float avg(int arr[][],int rows,int cols){
        float avg;

        return avg=sum(arr)/(rows*cols);
    
    
}}
