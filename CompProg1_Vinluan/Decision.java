import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        String name;
        int birth_year;
        int current_year = 2025;
        int age;

        System.out.print("Enter your Name: ");
        name = input.nextLine();

        System.out.print("Enter your Birth Year: ");
        birth_year = input.nextInt();
        
        System.out.print("Current Year: " + current_year);
        

        //Formula
        age = current_year - birth_year;

        System.out.print("\nAge: " + age);
        if (age < 18)
        System.out.println("\nYou are not allowed to vote!");
         
        


    }
}
