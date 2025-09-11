import java.util.Scanner;

public class peraPadala {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String sender_name;
        String sender_phone_number;
        String receiver_name;
        String receiver_phone_number;
        double amount_to_send;
        double fee = 0;
        double amount_to_pay;
        
        System.out.println("=== NLAC MoneySend  ===");
        System.out.println("========================");
        System.out.print("Sender's Name: ");
        sender_name = input.nextLine();

        System.out.print("Sender's Phone Number: ");
        sender_phone_number = input.nextLine();
        
        System.out.println("========================");

        System.out.print("Receiver's Name: ");
        receiver_name = input.nextLine();

        System.out.print("Receiver's Phone Number: ");
        receiver_phone_number = input.nextLine();

        System.out.print("Amount to Send: ");
        amount_to_send = input.nextDouble();

        if (amount_to_send <= 1000) {
        fee = amount_to_send * 0.05;   
        } else if (amount_to_send <= 5000) {
        fee = amount_to_send * 0.04;   
        } else if (amount_to_send <= 10000) {
        fee = amount_to_send * 0.03;   
        } else {
        fee = amount_to_send * 0.02;   
        }

        amount_to_pay = amount_to_send + fee;
        
        System.out.print("Fee: " + fee);
        System.out.print("\nAmount to Pay: " + amount_to_pay);
        System.out.println("\n========================");

        }
        }

        