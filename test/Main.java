
package EmployeeManagementSystem.test;
import java.util.Scanner;
import EmployeeManagementSystem.src.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Employee Address: ");
        String address = input.nextLine();

        System.out.print("Enter Department: ");
        String department = input.nextLine();

        System.out.print("Enter Employee ID: ");
        String id = input.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = input.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        Employee emp = new Employee(
            name,
            address,
            department,
            id,
            phoneNumber,
            basicSalary
        );

        emp.displayInfo();

        input.close();
    }
}