package Threading.Multy_Threading;

public class MyRunnable_2 implements Runnable{

    private final String text;

    MyRunnable_2(String text) {
        this.text = text;
    }
    @Override
    public void run() {
        try{
            for(int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + text);
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
