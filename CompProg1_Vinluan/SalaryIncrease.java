import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        String Name;
        String Job;
        int Salary;
        double Years_in_Service;
        double Increase;
        double Salary_increase;
        double New_Salary;

        System.out.print("Name: ");
        Name = input.nextLine();

        System.out.print("Job: ");
        Job = input.nextLine();

        System.out.print("Salary: ");
        Salary = input.nextInt();

        System.out.print("Years in Service: ");
        Years_in_Service = input.nextInt();
       
        //if statement
        if (Years_in_Service >= 5) {
            Increase = 0.05;
            System.out.println("Increase: " + Increase);
            Salary_increase = Salary * Increase;
            System.out.println("Salary Increase " + Salary_increase);
        }
        else {
            Increase = 0.02;
            System.out.println("Increase: " + Increase);
            Salary_increase = Salary * Increase;
            System.out.println("Salary Increase " + Salary_increase);
        }

        New_Salary = Salary + Salary_increase;
        System.out.println("New Salary: " + New_Salary);
        
        
    }
}
