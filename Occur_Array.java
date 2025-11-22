import java.util.Scanner;

public class Occur_Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size=input.nextInt();
        System.out.println("Enter num to find as occurences: ");
        int n=input.nextInt();
        int[] ar=new int[size];
        int c=0;
        for(int i=0;i<size;i++){
            System.out.println("Enter elements of an array: ");
            ar[i]=input.nextInt();
            if(ar[i]==n){
                c++;
            }
            
            
        }
        System.out.println(n+" has occured "+c+" times");

    }
    
}
