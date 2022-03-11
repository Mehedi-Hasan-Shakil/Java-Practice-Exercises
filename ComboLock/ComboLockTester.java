public class ComboLockTester {
    public static void main(String[] args) {
        ComboLock lock = new ComboLock(36, 24, 36);
        lock.reset();
        lock.turnRight(36);
        lock.turnLeft(12);
        lock.turnRight(11);
        lock.open();
    }
}
