import java.util.Scanner; //to import the scanner
  //29 July
public class Circle_input{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in); //to input scanner
    
    double pi = 3.1416; //to dictate pi
    int radius = 0; //to add the variable: radius
    double area; //to also add the variable for the formula
    System.out.println("Pi: " + pi);  //to dictate the value of pi
    System.out.print("Enter a value of radius ");  //To where to input the value of radius
    radius = input.nextInt(); //For it to enable u to enter the value of radius

    area = pi * radius * radius; //The formula of area
    System.out.println("Area of a circle is " + area); //To show the results


    }
}

