package multithreading;

import java.util.Random;

public class Main {
    static boolean hasFound = false;

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(1, 10000000);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000000; i++) {
                    if (hasFound) {
                        System.out.println("It takes " + i + " seconds");
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000000; i++) {
                    int b = random.nextInt(1, 10000000);
                    if (a == b) {
                        hasFound = true;
                        break;
                    }

                }
            }
        });
        thread2.start();
    }
}
