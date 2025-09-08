import java.util.Scanner;

public class computeAge {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int age; 
        int cur_year = 2025;
        int birth_year = 0;
 
        System.out.print("Enter your birth year: ");
        birth_year = input.nextInt();

        age = cur_year - birth_year;
        System.out.println("Age: " + age);
    
    }
}
