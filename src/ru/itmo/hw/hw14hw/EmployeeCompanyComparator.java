package ru.itmo.hw.hw14hw;

import java.util.Comparator;

public class EmployeeCompanyComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getCompany().compareTo(o2.getCompany()); // для строк
        }
    }

