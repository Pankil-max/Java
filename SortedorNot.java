import java.util.Scanner;

public class SortedorNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements of an array: ");
            arr[i] = input.nextInt();
        }

        if (isincreasing(arr)||isincreasing(arr)) {
            System.out.println("Your array is sorted ");
        }
         else {
            System.out.println("Your array is not sorted");
        }

    }

    public static boolean isincreasing(int arr[]) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isdecreasing(int arr[]) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; 
            }
        }
        return true;
    }
}
