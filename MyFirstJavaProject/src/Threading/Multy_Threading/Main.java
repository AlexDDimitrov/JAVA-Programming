package Threading.Multy_Threading;

import Threading.Threading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Game start");

        Thread thread1 = new Thread(new MyRunnable_2("Ping"));
        Thread thread2 = new Thread(new MyRunnable_2("Pong"));
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Game over");
    }
}
