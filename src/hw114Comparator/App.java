package hw114Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static hw114Comparator.MessageTask.countEachPriority;

public class App {
    public static void main(String[] args) {


        //Comparator<Employee> employeeComparator = new NameComparator().thenComparing(new SalaryComparator()).thenComparing(new AgeComparator()).thenComparing(new CompanyComparator());
        List<Employee> employees = Employee.employeeGenerator(20);
        System.out.println(employees);

        Comparator<Employee> byName = new NameComparator();
        Comparator<Employee> byAge = new AgeComparator();
        Comparator<Employee> bySalary = new SalaryComparator();
        Comparator<Employee> byCompany = new CompanyComparator();

// и сортировать по:
// имени
// имени и зарплате
// имени, зарплате, возрасту и компании

        employees.sort(byName);
        System.out.println(employees);

        employees.sort(byName.thenComparing(bySalary));
        System.out.println(employees);

        employees.sort(byName.thenComparing(bySalary).thenComparing(byAge).thenComparing(byCompany));
        System.out.println(employees);


    }
}
