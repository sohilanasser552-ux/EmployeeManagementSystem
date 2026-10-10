
package EmployeeManagementSystem.src;

public class Employee {

    // Attributes
    private String name;
    private String address;
    private String department;
    private String id;
    private String phoneNumber;
    private double basicSalary;

    // Parameterized Constructor
public Employee(String name, String address,
                String department, String id,
                String phoneNumber, double basicSalary) {

    this.name = name;
    this.address = address;
    this.department = department;
    this.id = id;
    this.phoneNumber = phoneNumber;
    this.basicSalary = basicSalary;
}

    // Default Constructor
    public Employee() {
    }

    // Calculate Net Salary
    public double netSal(double basicSalary) {
        return basicSalary - (basicSalary * 0.20);
    }

    // Calculate Salary
    public double calculateSalary() {
        return netSal(basicSalary);
    }

    // Display Employee Information
    public void dispEmp() {
        System.out.println("\n===== Employee Information =====");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("ID: " + id);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Net Salary: " + calculateSalary());
        System.out.println("================================");
    }

    // Display Info
    public void displayInfo() {
        dispEmp();
    }
}