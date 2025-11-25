import java.util.Scanner;

public class Occur_Array {
    
    public static void main(String[] args) {
                    Scanner input=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size=input.nextInt();
        System.out.println("Enter num to find as occurences: ");
        int n=input.nextInt();
        int[] ar=new int[size];

        System.out.println(n+" has occured "+noofocc(ar, n)+" times");


    }

    public static int  noofocc(int ar[],int n){
    
       Scanner input=new Scanner(System.in);


                int c=0;
        for(int i=0;i<ar.length;i++){
            System.out.println("Enter elements of an array: ");
            ar[i]=input.nextInt();
            if(ar[i]==n){
                 c++;
            }
            
            
        }
        return c++;
         

    }
    
}
