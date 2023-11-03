package day4;

class Employee {
    String emp_name;
    int emp_id;
    double emp_sal;

    Employee(String name, int id, double salary) {
        emp_name = name;
        emp_id = id;
        emp_sal = salary;
    }

    void printDetails() {
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Salary: $" + emp_sal);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 1001, 50000.0);
        emp1.printDetails();

        Employee emp2 = new Employee("Jane Smith", 1002, 60000.0);
        emp2.printDetails();
    }
}