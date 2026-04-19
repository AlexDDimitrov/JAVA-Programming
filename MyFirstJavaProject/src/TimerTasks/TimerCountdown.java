package TimerTasks;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0){
                    System.out.println("Happy new year");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);//task, delay, period
    }
}
