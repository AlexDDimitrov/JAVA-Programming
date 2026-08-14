package JavaLambdaExpressions;

import java.util.*;
import java.util.Arrays;

public class JavaLambdas {
    record Person(String first, String last) {
        @Override
        public String toString() {
            return first + " " + last;
        }
    }

    static void main(String[] args) {
        List<Person> personList = new ArrayList<>(Arrays.asList(
                new JavaLambdas.Person("Lucy", "Van Pelt"),
                new Person("Sally", "Brown"),
                new Person("Alex", "Dimitrov"),
                new Person("Linus", "Van Pelt"),
                new Person("Peppermint", "Patty"),
                new Person("Charlie", "Brown")
        ));

        personList.sort((o1, o2) -> o1.last().compareTo(o2.last));

        System.out.println(personList);

        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var comparatorMixed = new EnhancedComparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.last.compareTo(o2.last);
                return (result == 0 ? secondLevel(o1, o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.first.compareTo(o2.first);
            }
        };

        personList.sort(comparatorMixed);

        System.out.println(personList);
    }
}
