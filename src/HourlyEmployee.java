package EmployeeManagementSystem.src;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(
            int id, String name, Gender gender,
            Department department,
            double hoursWorked, double hourlyRate) {

        super();
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}