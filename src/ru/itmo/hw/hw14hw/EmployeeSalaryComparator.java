package ru.itmo.hw.hw14hw;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Integer.compare(o2.getSalary(), o1.getSalary()); // для значений
        }
    }

