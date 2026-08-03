package MasteringMoreJavaTypesAndArrays;

import JavaOOP.Employee;

import java.time.DayOfWeek;
import java.util.Random;

public class JavaEnums {
    static void main(String[] args) {
        //Weekdays weekdays = Weekdays.TUES;
        for (int i = 0; i < 10; i++) {
            Weekdays weekdays = getRandomDay();
            System.out.printf("%s, %d \n", weekdays.name(), weekdays.ordinal());

            if(weekdays == Weekdays.FRI) {
                System.out.println("It's Friday then, Saturday, Sunday, what?!");
            }
            switchDayOfWeek(weekdays);
        }

        for (Topping topping : Topping.values()) {
            System.out.println(topping.getPrice());
        }
    }

    public static Weekdays getRandomDay() {
        int randomInt = new Random().nextInt(7);
        var allDays = Weekdays.values();

        return allDays[randomInt];
    }

    public static void switchDayOfWeek(Weekdays weekdays) {
        switch (weekdays) {
            case WED -> System.out.println("Wednesday");
            case SAT -> System.out.println("Saturday");
            default -> {
                break;
            }
        }
    }
}
