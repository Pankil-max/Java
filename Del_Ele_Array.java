import java.util.Scanner;

public class Del_Ele_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements of an array: ");
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the number you want to delete from array:");
        int num = input.nextInt();
        delnum(arr, num);  // call delete function
    }

    public static void delnum(int arr[], int num) {
        int occ = noofocc(arr, num);        // ✅ fixed
        int new_size = arr.length - occ;
        int newarr[] = new int[new_size];

        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] != num) {
                newarr[j] = arr[i];
                j++;
            }
            i++;
        }

        // print new array
        System.out.println("Here is your new Array:");
        for (int x : newarr) {
            System.out.println(x);
        }
    }

    // method to count occurrences of a number in array
    public static int noofocc(int arr[], int num) {
        int count = 0;
        for (int x : arr) {
            if (x == num) count++;
        }
        return count;
    }
}
