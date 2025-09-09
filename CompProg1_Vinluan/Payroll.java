import java.util.Scanner;

public class Payroll {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String employee_name;
        int skill_level;
        double hours_worked;
        double rate_per_hour = 0;
        double overtime_hour = 0;
        double overtime_pay = 0;
        double regular_pay = 0;
        double gross_pay = 0;
        double tithe;
        double net_pay;

        System.out.print("Employee's Name: ");
        employee_name = input.nextLine();

        System.out.print("Skill Level: ");
        skill_level = input.nextInt();

        if (skill_level == 1) {
            rate_per_hour = 800;
        } else if (skill_level == 2) {
            rate_per_hour = 650;
        } else if (skill_level == 3) {
            rate_per_hour = 500;
        } 

        System.out.print("Hours Worked: ");
        hours_worked = input.nextDouble();

        if (hours_worked > 40) {
            overtime_hour = hours_worked - 40;
            overtime_pay = rate_per_hour * overtime_hour * 1.5;
            regular_pay = rate_per_hour * 40;
        } else {
            regular_pay = rate_per_hour * hours_worked;
            System.out.println("Overtime Hours: 0"); 
        }

        System.out.println("Rate per hour: " + rate_per_hour);
        System.out.println("Overtime Hours: " + overtime_hour); 
        System.out.println("Regular Pay: " + regular_pay);
        System.out.println("Overtime Pay: " + overtime_pay);

        gross_pay = regular_pay + overtime_pay;
        System.out.println("Gross Pay: " + gross_pay);

        tithe = gross_pay / 10;
        System.out.println("Tithe: " + tithe);

        net_pay = gross_pay - tithe; 
        System.out.println("NET Pay: " + net_pay);

    }
}