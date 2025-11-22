import java.util.Scanner;

public class SearchingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 32, 54, 76, 12, 87 };
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        if (isFound(ar, n) == true) {
            System.out.println(n + " is in your array list");
        } else {
            System.out.println(n + " is not in the array");
        }
    }

    public static boolean isFound(int ar[], int n) {
        int i = 0;
        while (i < ar.length) {
            if (ar[i] == n) {
                return true;
            }
            i++;

        }

        return false;
    }

}
