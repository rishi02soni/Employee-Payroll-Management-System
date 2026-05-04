import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n--- Payroll Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Add Manager");
            System.out.println("3. View Employees");
            System.out.println("4. Remove Employee");
            System.out.println("5. Exit");

            int ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Salary: ");
                    double sal = sc.nextDouble();

                    payroll.addEmployee(new Employee(id, name, sal));
                    break;

                case 2:
                    System.out.print("ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Salary: ");
                    sal = sc.nextDouble();
                    System.out.print("Bonus: ");
                    double bonus = sc.nextDouble();

                    payroll.addEmployee(new Manager(id, name, sal, bonus));
                    break;

                case 3:
                    payroll.viewEmployees();
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    payroll.removeEmployee(sc.nextInt());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
