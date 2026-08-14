package NestedClasses;

import java.util.Comparator;

public class StoreEmploye extends Employee{
    private String store;

    public StoreEmploye() {

    }

    public StoreEmploye(int id, String name, int yearStarted, String store) {
        super(id, name, yearStarted);
        this.store = store;
    }

    @Override
    public String toString() {
        return "%-8s%s".formatted(store, super.toString());
    }

    public class StoreComparator<T extends  StoreEmploye> implements Comparator<StoreEmploye> {

        @Override
        public int compare(StoreEmploye o1, StoreEmploye o2) {
            int result = o1.store.compareTo(o2.store);
            if (result == 0) {
                return new Employee.EmployeeComparator<Employee>("yearStarted").compare(o1, o2);
            }
            return result;
        }
    }
}
