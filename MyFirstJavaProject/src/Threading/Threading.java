package Threading;

import java.util.Scanner;

public class Threading {
    //Threading - allows a program to run multiple tasks simultaneously
    //helps improve performance with time-consuming operations

    //creating a thread:
    //option 1: extend thread class - simpler
    //option 2: implement runnable interface - better - we do this way in this file
    public static void main(String[] args) {
        // main thread
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("5 secs to enter");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);


        scanner.close();
    }
}
