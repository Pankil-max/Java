import java.util.Scanner;

public class max_min_array {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=input.nextInt();
        int[] arr=new int[size];
                for(int i=0;i<arr.length;i++){
            System.out.println("Enter elements of array: ");
            arr[i]=input.nextInt();
            

        }
        System.out.println("Maximum value is: "+check( arr));
        System.out.println("Maximum value is: "+min( arr));

    }
    public static int check(int[] arr){
       
            

        int max=arr[0];
        int i=0;
        while (i<arr.length) {
            if(max<arr[i])
                {
                    max=arr[i];

            }


            

            i++;
        }
        


        return max;
    }
    public static int min(int arr[]) {
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }

        }
        
        

        

        return min;
    }
    
}
