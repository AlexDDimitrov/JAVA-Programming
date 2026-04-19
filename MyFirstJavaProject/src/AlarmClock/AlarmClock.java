package AlarmClock;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.sql.SQLRecoverableException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {

        while(LocalTime.now().isBefore(alarmTime)) {
            try{
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        System.out.println("\nAlarm Noises");
        //Toolkit.getDefaultToolkit().beep();
        playAudio(filePath);

    }

    private void playAudio(String filePath) {
        File audioFile = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.print("Press Enter to Stop the alarm: ");
            scanner.nextLine();

            clip.close();
            scanner.close();
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported Format");
        } catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
