import java.util.Scanner;

public class Sumofdiagonals_2DArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows=input.nextInt();
        System.out.println("Enter no. of Columns: ");
        int cols=input.nextInt();
        int arr[][]=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at (" + i + "," + j + "): ");
                arr[i][j] = input.nextInt();
            }
        }

        
        System.out.println("Sum of diagonals is: "+sumofdiagonals(arr));
        
    }
    public static long  sumofdiagonals(int arr[][]){
        long left_diag = sumofleftdiagonal(arr);
        long right_diag=sumofrightdiagonal(arr);
        long sum=left_diag+right_diag;
        int index=arr.length/2;
        if(arr.length%2!=0){
            sum-=arr[index][index];
        }


        return sum;
    }
    public static long sumofleftdiagonal(int arr[][]){
        long sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][i];
            
        }

        return sum;
    }
     public static long sumofrightdiagonal(int arr[][]){
        long sum=0;
        for (int i = 0; i < arr.length; i++) {
            
            sum+=arr[i][arr.length-1-i];

            
        }

        return sum; 
    }

    
}
