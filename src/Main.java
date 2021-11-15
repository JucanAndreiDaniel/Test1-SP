package src;

import src.Department.DepartmentType;
import src.Employee.EmployeeType;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("John", "St Avenue", 3500, EmployeeType.IT,"Frontend");
		Employee employee2 = new Employee("Harvir", "St aaaa", 4000, EmployeeType.HR,"Hire people");
		Employee employee3 = new Employee("Fahmida", "St bbbb", 5000, EmployeeType.IT,"back end");
		Employee employee4 = new Employee("Ammarah", "St cccc", 4370, EmployeeType.IT,"Database");
		Employee employee5 = new Employee("Riddle", "St dddd", 1123, EmployeeType.HR,"");
		Employee employee6 = new Employee("Ford", "St eeee", 54312, EmployeeType.MANAGEMENT,"put hr to hire people");
		Employee employee7 = new Employee("Stanton", "St ffff", 24365, EmployeeType.MANAGEMENT,"");
		Employee employee8 = new Employee("Crane", "St gggg", 5867, EmployeeType.HR,"Fire people");

		Department it = new Department("IT", DepartmentType.DEVELOPMENT);

		it.addEmployee(employee);
		it.addEmployee(employee3);

		Department hr = new Department("HR", DepartmentType.LOGISTICS);

		hr.addEmployee(employee2);
		hr.addEmployee(employee5);

		Department management = new Department("Management", DepartmentType.INFRASTRUCTURE);

		management.addEmployee(employee6);
		management.addEmployee(employee7);
		management.addEmployee(employee4);
		management.addEmployee(employee8);

		management.addSubDepartment(hr);

		Company company = new Company("Abble", "Calibornia");

		company.addDepartment(it);
		company.addDepartment(management);

		company.print();

		company.printAudit();

	}
}