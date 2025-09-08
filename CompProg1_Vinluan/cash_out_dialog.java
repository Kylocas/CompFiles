import java.util.Scanner;

import javax.swing.JOptionPane;

public class cash_out_dialog {

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
        
        double amount_to_pay = amount + charge;
        JOptionPane.showMessageDialog(null, "Charge: " + charge + "\nAmount to Pay: " + amount_to_pay);
     }
}
