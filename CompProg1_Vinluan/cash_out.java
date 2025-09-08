import java.util.Scanner;

public class cash_out {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        String name;
        int mobile_number;
        double amount = 0;
        double charge;
       
         System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your mobile number: ");
        mobile_number = input.nextInt();

        System.out.print("Enter the amount: ");
        amount = input.nextDouble();

        
        charge = amount * .02; 

        System.out.println("Charge: " + charge);

        double amount_to_pay = amount + charge;
        System.out.println("Amount to pay: " + amount_to_pay);

         

        
    }
}
