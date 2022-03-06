import java.util.Scanner;

class ComboLockTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int turnRight1 = in.nextInt();
        int turnLeft = in.nextInt();
        int turnRight2 = in.nextInt();
        ComboLock lock = new ComboLock(36, 24, 36);
        lock.reset();
        lock.turnRight(turnRight1);
        lock.turnLeft(turnLeft);
        lock.turnRight(turnRight2);
        if (lock.open()) {
            System.out.println("Open");
        } else {
            System.out.println("Wrong combination.");
        }
    }
}
