import java.util.Scanner;

public class Ausadhi_Pasal {
    public static void main(String[] args) {
        //For medicine 1 
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Ausadhi Pasal ");
        System.out.println("Enter details for medicine 1");
        System.out.println("Enter 1st medicine name:");
        String n1=input.nextLine();
        System.out.println("Enter 1st medicine price:");
        float p1=input.nextFloat();
        input.nextLine();
        System.out.println("Enter 1st medicine quantity:");
        int q1=input.nextInt();
        System.out.print("Requires prescription? (1=Yes, 0=No): ");
        int prescription1=input.nextInt();
        input.nextLine();

        //For medicine 2
    
        System.out.println("Enter 2nd medicine name:");
        String n2=input.nextLine();
        System.out.println("Enter 2nd medicine price:");
        float p2=input.nextFloat();
        input.nextLine();
        System.out.println("Enter 2nd medicine quantity:");
        int q2=input.nextInt();
        System.out.print("Requires prescription? (1=Yes, 0=No): ");
        int prescription2=input.nextInt();
        input.nextLine();

        //For medicine 3
        System.out.println("Enter 3rd medicine name:");
        String n3=input.nextLine();
        System.out.println("Enter 3rd medicine price:");
        float p3=input.nextFloat();
        input.nextLine();
        System.out.println("Enter 3rd medicine quantity:");
        int q3=input.nextInt();
        System.out.print("Requires prescription? (1=Yes, 0=No): ");
        int prescription3=input.nextInt();
        input.nextLine();

        System.out.println("Medicine_Name\t\tPrice\t\tQuantity\t\tPrescription");
        System.out.println(n1 + "\t\t" + p1 + "\t\t" + q1 + "\t\t" + (prescription1 == 1 ? "Yes" : "No"));
        System.out.println(n2 + "\t\t" + p2 + "\t\t" + q2 + "\t\t" + (prescription2 == 1 ? "Yes" : "No"));
        System.out.println(n3 + "\t\t" + p3 + "\t\t" + q3 + "\t\t" + (prescription3 == 1 ? "Yes" : "No"));






        

        

        
        
    }
    
}
