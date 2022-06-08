package ru.itmo.hw.hw14lesson.Employee;

import java.util.Comparator;
import java.util.List;

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employeeGenerator(20);
        // ����������� ��:
        Comparator<Employee> byName = new NameComparator();
        Comparator<Employee> byAge = new AgeComparator();
        Comparator<Employee> bySalary = new SalaryComparator();
        Comparator<Employee> byCompany = new CompanyComparator();

        employees.sort(byName); // �����
        employees.forEach(employee -> System.out.println(employee.getName()));

        employees.sort(byName.thenComparing(bySalary));// ����� � ��������
        employees.forEach(employee -> System.out.println(employee.getName() + " " + employee.getSalary()));

        // �����, ��������, �������� � ��������
        employees.sort(byName.thenComparing(bySalary).thenComparing(byAge).thenComparing(byCompany));
        employees.forEach(System.out::println);


    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}

class CompanyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}
