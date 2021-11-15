package src;

public class Employee {

    enum EmployeeType {
        IT, HR, MANAGEMENT, SALES
    }

    String name;
    String address;
    int salary;
    String attribute;
    EmployeeType type;

    // Constructor
    public Employee(String name, String address, int salary, EmployeeType type, String attribute) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.type = type;
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public EmployeeType getType() {
        return this.type;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void print() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Type: " + type);
        if (attribute != null && !attribute.equals("")) {
            System.out.println("Attribute: " + attribute);
        }
    }

}