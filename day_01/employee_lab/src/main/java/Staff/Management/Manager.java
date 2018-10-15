package Staff.Management;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String ni, int salary, String deptName) {
        super(name, ni, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void raiseSalary(double percentage) {
        this.setSalary(this.getSalary() * percentage);
    }

    public double payBonus() {
        return getSalary() * 0.01;
    }
}
