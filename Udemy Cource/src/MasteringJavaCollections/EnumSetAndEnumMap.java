package MasteringJavaCollections;

import java.util.*;

public class EnumSetAndEnumMap {
    enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    static void main(String[] args) {
        List<WeekDay> annsWorkDays = new ArrayList<>(List.of(WeekDay.MONDAY, WeekDay.TUESDAY, WeekDay.THURSDAY, WeekDay.FRIDAY));

        var annsDaySet = EnumSet.copyOf(annsWorkDays);
        System.out.println(annsDaySet.getClass().getSimpleName());
        annsDaySet.forEach(System.out::println);
        System.out.println();
        var allDaysSet = EnumSet.allOf(WeekDay.class);
        allDaysSet.forEach(System.out::println);

        System.out.println();
        Set<WeekDay> newPDays = EnumSet.complementOf(annsDaySet);
        newPDays.forEach(System.out::println);

        Set<WeekDay> anotherWay = EnumSet.copyOf(allDaysSet);
        anotherWay.removeAll(annsWorkDays);
        System.out.println();
        anotherWay.forEach(System.out::println);

        System.out.println();
        Set<WeekDay> businessDays = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        businessDays.forEach(System.out::println);

        System.out.println();

        Map<WeekDay, String[]> emplyeeMap = new EnumMap<>(WeekDay.class);
        emplyeeMap.put(WeekDay.FRIDAY, new String[] {"Ann", "Mary", "Bob"});
        emplyeeMap.put(WeekDay.MONDAY, new String[] {"Ann", "Bob"});
        emplyeeMap.forEach(
                (k, v) -> {
                    System.out.println(k + ": " + Arrays.toString(v));
                }
        );
    }
}
