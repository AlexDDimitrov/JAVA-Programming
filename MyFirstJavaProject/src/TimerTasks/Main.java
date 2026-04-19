package TimerTasks;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        //timer - class that schedules tasks at specific times or periodically
        //useful for sending notifications, scheduled updates, repetitive actions

        //Timer task - represents the task that will be executed by the timer
        //             you will extend the TimerTask class to define your task
        //             Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello");
                count--;
                if(count<=0) {
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);


    }
}
