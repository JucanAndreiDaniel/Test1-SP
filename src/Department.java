package src;

import java.util.ArrayList;
import java.util.List;

public class Department {

    enum DepartmentType {
        LOGISTICS, INFRASTRUCTURE, DEVELOPMENT
    }

    String name;
    ArrayList<Employee> employees;
    ArrayList<Department> subDepartments;
    DepartmentType type;

    public Department(String name, DepartmentType type) {
        this.name = name;
        this.type = type;
        employees = new ArrayList<>();
        subDepartments = new ArrayList<>();
    }

    public void addSubDepartment(Department subDepartment) {
        subDepartments.add(subDepartment);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeSubDepartment(Department subDepartment) {
        subDepartments.remove(subDepartment);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Department> getSubDepartments() {
        return subDepartments;
    }

    public DepartmentType getType() {
        return type;
    }

    public void print() {
        System.out.println();
        System.out.println("Department: " + name);
        System.out.println("Type: " + type);
        System.out.println("Employees: ");
        for (Employee employee : employees) {
            employee.print();
        }

        System.out.println();
        System.out.println("SubDepartments: ");
        for (Department subDepartment : subDepartments) {
            subDepartment.print();
        }
    }
}
