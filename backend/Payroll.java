import java.util.*;

public class Payroll {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee Added!");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Found.");
            return;
        }

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void removeEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
        System.out.println("Employee Removed!");
    }
}
