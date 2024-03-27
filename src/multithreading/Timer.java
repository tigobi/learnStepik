package multithreading;

public class Timer implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            System.out.println(1);
        }
    }
}
