import java.time.*;
import java.time.format.DateTimeFormatter;

public class Dates {
    // LocalDate, LocalTime, LocalDateTime, UTC timestamp

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        //custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        //LocalDate date = LocalDate.of(2024, 12, 25);


        LocalDateTime dateTime2 = LocalDateTime.of(2024, 12, 25, 12, 00, 00);
        if(dateTime.isBefore(dateTime2)) {
            System.out.println("Date 1 earlier than day 2");
        } else if (dateTime.equals(dateTime2)) {
            System.out.println("Dates are the same");
        }
        else {
            System.out.println("Date 2 is earlier that date 1");
        }
    }
}
