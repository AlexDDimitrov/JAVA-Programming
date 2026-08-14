package NestedClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {
    static void main(String[] args) {
        List<StoreEmploye> employees = new ArrayList<>(List.of(
                new StoreEmploye(10000, "Alex", 2026, "Target"),
                new StoreEmploye(10001, "Ralph", 2020, "Walmart"),
                new StoreEmploye(10002, "Carole", 2023, "Macys"),
                new StoreEmploye(10003, "Jane", 2015, "Walmart"),
                new StoreEmploye(10004, "Laura", 2022, "Target"),
                new StoreEmploye(10005, "Jim", 2024, "Lidl")
        ));

        var c0 = new EmployeeComparator<StoreEmploye>();
        var c1 = new Employee.EmployeeComparator<StoreEmploye>();
        var c2 = new StoreEmploye().new StoreComparator<StoreEmploye>();

        //local class
        class NameSort<T> implements Comparator<StoreEmploye> {

            @Override
            public int compare(StoreEmploye o1, StoreEmploye o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

        var c3 = new NameSort<StoreEmploye>();

        //anonymous class
        var c4 = new Comparator<StoreEmploye>() {
            @Override
            public int compare(StoreEmploye o1, StoreEmploye o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        sortIt(employees, c0);
        sortIt(employees, c1);
        sortIt(employees, c2);
        sortIt(employees, c3);
        sortIt(employees, c4);
        sortIt(employees,
                (o1, o2) -> o1.getName().compareTo(o2.getName())
        );
    }

    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator) {
        System.out.println("Sorting with: " + comparator.toString());

        list.sort(comparator);
        for (var e : list) {
            System.out.println(e);
        }
    }
}
