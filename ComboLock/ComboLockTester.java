public class ComboLockTester {
    public static void main(String[] args) {
        ComboLock lock = new ComboLock(7, 6, 5);
        lock.reset();
        lock.turnRight(7);
        lock.turnLeft(1);
        lock.turnRight(39);
        if (lock.open())
            System.out.println("Opened");
        else
            System.out.println("Wrong combination");
    }
}
