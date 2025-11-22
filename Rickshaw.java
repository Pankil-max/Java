import java.util.Scanner;

public class Rickshaw {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter distance in km: ");
        float distance=input.nextFloat();
        input.nextLine();
        System.out.println("Enter time in minutes: ");
        float time=input.nextFloat();
        input.nextLine();
        System.out.println("Are you local? (yes or no): ");
        char type=input.nextLine().charAt(0);
        System.out.println("Are you traveling at night? (yes or no): ");
        char travel=input.nextLine().charAt(0);
        float fare= (float)(15*distance)+(4*time);
        float Increased_fare= (float)1.10*fare;
        float Discount_fare=(float)0.90*fare;
        float final_fare=(type=='y'&& travel=='y')?Discount_fare:(type!='y'&& travel=='y')?Increased_fare:fare;
        System.out.println("Your final fare is: "+final_fare);


        

    }
    
}
