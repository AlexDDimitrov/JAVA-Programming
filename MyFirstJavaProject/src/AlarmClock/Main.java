package AlarmClock;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "D:\\User\\Documents\\CodingFiles\\Java\\MyFirstJavaProject\\src\\AlarmClock\\Buckshot Roulette General Release.wav";

        while(alarmTime == null) {
            try{
                System.out.print("Enter an alarm time(HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for: " + alarmTime);
            }
            catch (DateTimeException e) {
                System.out.println("Invalid format");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);

        alarmThread.start();

    }
}
