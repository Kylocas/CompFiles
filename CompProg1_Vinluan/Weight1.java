import java.util.Scanner;

public class Weight1 {
     public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        //Variables
        Double Weight;
        String Location;
        String box_size;
        Double shipping_fee;
        Double Additional_Charge;
        Double Total_Shipping_Fee;
        int num_for_location;
        

        System.out.println ("=================Welcome to EFG Courier ==================");
        System.out.print("Weight: ");
        Weight = input.nextDouble();
        
        System.out.print("Enter a number between 1-3 for location: ");
        num_for_location = input.nextInt();
        
        if (num_for_location == 1){
            Location = "Luzon";
        } else if (num_for_location == 2) {
            Location = "Visayas"; 
        } else if (num_for_location == 3) {
            Location = "Mindanao";
            System.out.println("Location: " + Location);
        }
        
        
        if (Weight <= 3){
            box_size = "Small";
            shipping_fee = 100.0;
        }   else if (Weight <= 5) {
            box_size = "Medium";
            shipping_fee = 200.0;
        }   else if (Weight > 5) {
            box_size = "Large";
            shipping_fee = 300.0;
        
            System.out.println("\nShipping Details");
            System.out.println("Weight: " + Weight);
            System.out.println("Box Size: " + box_size);
            System.out.println("Shipping Fee: " + shipping_fee);
        }
    }
        }
        
         

