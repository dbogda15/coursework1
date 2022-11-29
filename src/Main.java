import coursework.Employee;
import coursework.EmployeeService;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov", "Ivan", "Ivanovich", 3, 30000);
        employee[1] = new Employee("Petrov", "Petr", "Petrovich", 4, 40000);
        employee[2] = new Employee("Glebov", "Gleb", "Glebovich", 4, 67000);
        employee[3] = new Employee("Osipova", "Nadezhda", "Igorevna", 1, 51000);
        employee[4] = new Employee("Saburov", "Nurlan", "Nurlanovich", 2, 10000);
        employee[5] = new Employee("Musagaliev", "Azamat", "Takhirovich", 1, 31000);
        employee[6] = new Employee("Karimova", "Karina", "Ramilevna", 4, 44000);
        employee[7] = new Employee("Ponchickov", "Ponchick", "Ponchickovich", 2, 100000);
        employee[8] = new Employee("Lavrova", "Lubov", "Alekseevna", 3, 10000);
        employee[9] = new Employee("Babushkina", "Devushka", "Dedushkina", 2, 54000);

        employee[5].setSalary(130000);
        employee[5].setDepartment(5);

        Employee.listStaff(employee);
        System.out.println(employeeService.findSum(employee));
        System.out.println(employeeService.findAverageSalary(employee));
        System.out.println(employeeService.findMaxSalary(employee));
        System.out.println(employeeService.findMinSalary(employee));
    }
}