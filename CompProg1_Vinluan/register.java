import java.util.Scanner; //to import the scanner for user input

// the class name
public class register { 
    
    //for the program to run 
    public static void main(String[] args) { 
 
        //to input a scanner object
        Scanner input = new Scanner(System.in); 

        //Variables
        String name;
        String Address;
        int cur_year = 2025;
        int birth_year = 0;
        int age;
        
        //For us to be able to input the name, address, and birth year 
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your address: ");
        Address = input.nextLine();

        System.out.print("Enter your birth year: ");
        birth_year = input.nextInt();
        
        //The formula to calculate the age
        age = cur_year - birth_year;
        
        //To show the output
        System.out.print("Age " + age);

    }
}
