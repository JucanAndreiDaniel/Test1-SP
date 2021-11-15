package src;

import java.util.ArrayList;
import java.util.List;

import src.Employee.EmployeeType;

public class Company {
    String name;
    String address;
    ArrayList<Department> departments;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
        this.departments = new ArrayList<>();
    }

    public void printAudit() {

        List<Employee> allEmployees = new ArrayList<>();
        for (Department department : departments) {
            for (Employee employee : department.employees) {
                allEmployees.add(employee);
                System.out.println(employee);
            }
        }

        // print salaries per employee type
        for (EmployeeType employeeType : EmployeeType.values()) {
            double totalSalary = 0;
            for (Employee employee : allEmployees) {
                if (employee.type == employeeType) {
                    totalSalary += employee.salary;
                }
            }
            System.out.println(employeeType + ": " + totalSalary);
        }

    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Company: " + name + " " + address);
        for (Department department : departments) {
            department.print();
        }
    }

}
