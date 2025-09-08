import java.util.Scanner;

import javax.swing.JOptionPane;

public class utang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String borrowers_name;
        int amount_to_borrow;
        double interest_per_year = .06; 
        int term;
        double monthly_interest;
        int total_number_of_payments;

        System.out.print("Name: ");
        borrowers_name = input.nextLine();

        System.out.print("Amount Borrowed: ");
        amount_to_borrow = input.nextInt();

        System.out.print("Interest/Year: " + interest_per_year);

        System.out.print("\nTerm: ");
        term = input.nextInt();

        monthly_interest = (amount_to_borrow * interest_per_year) / 12;

        total_number_of_payments = term * 12;

        JOptionPane.showMessageDialog(null, "\nName: " + borrowers_name + "\nAmount Borrowed: " 
        + amount_to_borrow + "\nInterest/year: " + interest_per_year + "\nTerm: " + term + 
        "\nMonthly Interest: " + monthly_interest + "\nTotal Number of Payments: " + total_number_of_payments);
         


        
    }
}
