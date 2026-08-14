package NestedClasses;

import NestedClasses.StoreEmploye.StoreComparator;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class NestedClasses {
    static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10000, "Alex", 2026),
                new Employee(10001, "Ralph", 2020),
                new Employee(10002, "Carole", 2023),
                new Employee(10003, "Jane", 2015),
                new Employee(10004, "Laura", 2022),
                new Employee(10005, "Jim", 2024)
        ));

        employees.sort(new Employee.EmployeeComparator<Employee>("yearStarted").reversed());

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("Store members");
        List<StoreEmploye> storeEmployees = new ArrayList<>(List.of(
                new StoreEmploye(10000, "Alex", 2026, "Target"),
                new StoreEmploye(10001, "Ralph", 2020, "Walmart"),
                new StoreEmploye(10002, "Carole", 2023, "Macys"),
                new StoreEmploye(10003, "Jane", 2015, "Walmart"),
                new StoreEmploye(10004, "Laura", 2022, "Target"),
                new StoreEmploye(10005, "Jim", 2024, "Lidl")
        ));

        storeEmployees.sort(new StoreEmploye().new StoreComparator<StoreEmploye>().reversed());
        for (StoreEmploye e : storeEmployees) {
            System.out.println(e);
        }

        addPigLatinName(employees);
    }

    public static void addPigLatinName(List<? extends  Employee> list) {
        String lastName = "Piggy";

        class DecoratedEmployee extends StoreEmploye
                implements Comparable<DecoratedEmployee> {

            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size());

        for (var employee : list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }

        newList.sort(null);
        for (var dEmployee : newList) {
            System.out.println(dEmployee.originalInstance.getName() + " "
                    + dEmployee.pigLatinName);
        }
    }
}
