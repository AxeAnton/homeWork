package ru.itmo.hw.hw14hw;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Integer.compare(o2.getAge(), o1.getAge());  // для значений
        }
    }

