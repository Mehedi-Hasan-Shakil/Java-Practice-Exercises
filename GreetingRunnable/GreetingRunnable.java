import java.util.Date;

public class GreetingRunnable implements Runnable {
    private static final int REPETITIONS = 10;
    private static final int DELAYS = 1000;
    private String greeting;

    public GreetingRunnable(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < REPETITIONS; i++) {
                Date now = new Date();
                System.out.println(greeting + " " + now);
                Thread.sleep(DELAYS);
            }
        } catch (InterruptedException e) {
        }
    }
}
