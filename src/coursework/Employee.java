package coursework;

import java.util.Objects;

public class Employee {
    private final int id;
    private static int count = 1;
    private final String name;
    private final String surname;
    private final String middleName;
    private int department;
    private int salary;

    public Employee (String surname, String name, String middleName, int department, int salary ) {
        this.id = count++;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public static void listStaff (Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFullName () {
        return surname + " " + name + " " + middleName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, middleName, salary);
    }

    @Override
    public String toString() {
        return  id + ". " + surname + " " + name + " " + middleName + ", номер отдела: " + department + ", зарплата: " + salary + " руб.";
    }
}
