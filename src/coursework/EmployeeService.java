package coursework;

import java.util.Arrays;

public class EmployeeService {
    public Employee[] employee = new Employee[10];

    public String findSum(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return "\nСумма затрат на зарплаты в месяц: " + sum;
    }

    public String findMaxSalary(Employee[] employee) {
        int maxSalary = 0;
        String employeeMax = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                employeeMax = employee[i].getFullName();
            }
        }
        return "\nУ сотрудника: " + employeeMax + " максимальная заработная плата:  " + maxSalary + " руб";
    }


    public String findMinSalary(Employee[] employee) {
        int minSalary = 100000000;
        String employeeMin = null;
        for (int i = employee.length - 1; i > 0; i--) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                employeeMin = employee[i].getFullName();
            }
        }
        return "\nУ сотрудника: " + employeeMin + " минимальная заработная плата: " + minSalary + " руб";
    }

    public String findAverageSalary(Employee[] employee) {
        int sum = 0;
        int averageSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        averageSalary = sum / employee.length;
        return "Средняя заработная плата за месяц: " + averageSalary;
    }
}