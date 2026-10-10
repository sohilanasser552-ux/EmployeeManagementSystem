package EmployeeManagementSystem.src;

public class MonthlyEmployee extends Employee {
    private double monthlySalary;

    public MonthlyEmployee(
            int id, String name, Gender gender,
            Department department, double monthlySalary) {

        super();
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}