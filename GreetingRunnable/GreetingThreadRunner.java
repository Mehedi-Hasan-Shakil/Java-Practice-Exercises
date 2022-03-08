public class GreetingThreadRunner {
    public static void main(String[] args) {
        Runnable r1 = new GreetingRunnable("Hello");
        Thread t1 = new Thread(r1);
        Runnable r2 = new GreetingRunnable("Bye");
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
