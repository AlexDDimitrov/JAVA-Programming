package Generics.Wildcards;

import java.util.*;

record Employee(String name) implements QueryItem{

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

public class Main {
    static void main(String[] args) {

        int stdCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < stdCount; i++) {
            students.add(new LPAStudent());
        }

        printMoreList(students);

        List<LPAStudent> LPAstudents = new ArrayList<>();
        for (int i = 0; i < stdCount; i++) {
            LPAstudents.add(new LPAStudent());
        }

        printMoreList(LPAstudents);

        testList(new ArrayList<>(List.of("Able", "Bary", "Charlie")));
        testList(new ArrayList<>(List.of(1, 3, 6)));

        System.out.println();

        var queryList = new QueryList<>(LPAstudents);
        var matches = queryList.getMatches(
                "COURSE", "JAVA"
        );
        printMoreList(matches);

        var students2021 = QueryList.getMatches(students, "YearStarted", "2021");
        printMoreList(students2021);

//        QueryList<Employee> employeeQueryList = new QueryList<>();
//                  ^not valid type
    }

//                                 ? -> wildcard
    static void printMoreList(List<? extends Student> studentList) {
        //                         ? super LPAStudent, but getYearStarted wont work
        //                         same for: ? super Student
        for (var student : studentList) {
            System.out.println(student.getYearStated() + ": " + student);
        }
        System.out.println();
    }

    static void testList(List<?> args) {
        for (var element : args) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

//    static <T extends Student> void printList(List<T> studentList) {
//        for (var student : studentList) {
//            System.out.println(student.getYearStated() + ": " + student);
//        }
//        System.out.println();
//    }



//    public static void testList (List<String> list) {
//        for (var e : list) {
//            System.out.println(e.toUpperCase() + " string");
//        }
//    }
//
//    public static void testList (List<Integer> list) {
//        for (var e : list) {
//            System.out.println(e.floatValue() + " integer");
//        }
//    }
}
