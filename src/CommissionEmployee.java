package EmployeeManagementSystem.src;

public class CommissionEmployee extends Employee {
    private double sales;
    private double commissionRate;

    public CommissionEmployee(
            int id, String name, Gender gender,
            Department department,
            double sales, double commissionRate) {

        super();
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateSalary() {
        return sales * commissionRate;
    }
}