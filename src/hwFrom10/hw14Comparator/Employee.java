package hwFrom10.hw14Comparator;
// Создать список объетов List<Employee> (использовать метод employeeGenerator)
// и сортировать по:
// имени
// имени и зарплате
// имени, зарплате, возрасту и компании

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Employee implements  Comparable<Employee> {

    private String name;
    private String company;
    private int salary;
    private int age;



    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public String getCompany() {
        return company;
    }


    public int getSalary() {
        return salary;
    }


    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getSalary() == employee.getSalary() && getAge() == employee.getAge() && getName().equals(employee.getName()) && getCompany().equals(employee.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCompany(), getSalary(), getAge());
    }

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);

         // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(names[(int)(Math.random()*names.length)], companies[(int)(Math.random() * companies.length)], (int) ( 10 + Math.random() * 90), (int) ( 21 + Math.random() * 39)));


            // TOO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп
            //employees.add( );
        }
        return employees;

    }

    @Override
    public String toString() {
        return "\n" + "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }



    @Override
    public int compareTo(Employee o) {
        // return Integer.compare(this.getName(), getName()); // FIXME ОЧЕНЬ важно, если сравниваем Integer, то используем compare и текущий синтаксис, если сравниваем String то compareTo и синтаксис ниже строчкой.
        return this.getName().compareTo(getName());
    }


}



class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
        // FIXME ОЧЕНЬ важно, если сравниваем Integer, то используем compare и необходимый синтаксис, если сравниваем String то compareTo и текущий синтаксис.
    }
}
class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
        // FIXME ОЧЕНЬ важно, если сравниваем Integer, то используем compare и текущий синтаксис, если сравниваем String то compareTo и необходимый синтаксис.
    }
}

class CompanyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
         // FIXME ОЧЕНЬ важно, если сравниваем Integer, то используем compare и необходимый синтаксис, если сравниваем String то compareTo и текущий синтаксис.
    }
}
