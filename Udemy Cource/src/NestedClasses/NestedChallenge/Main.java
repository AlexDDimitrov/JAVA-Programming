package NestedClasses.NestedChallenge;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.*;

public class Main {
    static void main(String[] args) {
        Employee e1 = new Employee("Alex", "Dimitrov", "01/02/2015");
        Employee e2 = new Employee("John", "Bennet", "05/08/2000");
        Employee e3 = new Employee("James", "May", "11/07/2011");
        Employee e4 = new Employee("Jeremy", "Clarkson", "05/03/2013");
        Employee e5 = new Employee("Richard", "Hammond", "23/02/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        printList(list, "name");
        System.out.println();
        printList(list, "notName");
    }

    public static void printList(List<? extends Employee> eList, String sortField) {
        int currentYear = LocalDate.now().getYear();

        class MyEmployee {
            Employee employee;
            int yearsWorked;
            String fullName;

            public MyEmployee(Employee employee) {
                this.employee = employee;
                yearsWorked = currentYear - Integer.parseInt(employee.hireDate().split("/")[2]);
                fullName = String.join(" ", employee.first(), employee.last());

            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName, yearsWorked);
            }
        }

        List<MyEmployee> list = new ArrayList<>();
        for (Employee employee : eList) {
            list.add(new MyEmployee(employee));
        }

        var comparator = new Comparator<MyEmployee>() {

            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if (sortField.equalsIgnoreCase("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };

        list.sort(comparator);

        for (MyEmployee myEmployee : list) {
            System.out.println(myEmployee);
        }
    }
}
