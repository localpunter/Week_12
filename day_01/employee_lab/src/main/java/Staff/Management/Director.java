package Staff.Management;

public class Director extends Manager {

    private String deptName;
    private double budget;

    public Director(String name, String ni, int salary, String deptName, double budget) {
        super(name, ni, salary, deptName);
        this.budget = budget;
    }

    public String getDeptName() {
        return deptName;
    }

    public void raiseSalary(double percentage) {
        this.setSalary(this.getSalary() * percentage);
    }

    public double payBonus() {
        return getSalary() * 0.05;
    }
}
