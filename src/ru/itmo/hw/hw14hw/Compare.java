package ru.itmo.hw.hw14hw;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import static ru.itmo.hw.hw14hw.Employee.employeeGenerator;
// и сортировать по:
// имени
// имени и зарплате
// имени, зарплате, возрасту и компании

public class Compare {
    public static void main(String[] args) {

        Comparator<Employee> employeeComparator1 =
                new EmployeeNameComparator();

        Comparator<Employee> employeeComparator2 =
                new EmployeeNameComparator().
                        thenComparing(new EmployeeSalaryComparator());

        Comparator<Employee> employeeComparator4 =
                new EmployeeNameComparator().
                    thenComparing(new EmployeeAgeComparator().
                        thenComparing(new EmployeeSalaryComparator()).
                            thenComparing(new EmployeeNameComparator()));

        TreeSet<Employee> treeSet1 = new TreeSet<>(employeeComparator1);
        TreeSet<Employee> treeSet2 = new TreeSet<>(employeeComparator2);
        TreeSet<Employee> treeSet4 = new TreeSet<>(employeeComparator4);


        List<Employee> employees = employeeGenerator(10);
        System.out.println(treeSet4.addAll(employees));


    }
}
