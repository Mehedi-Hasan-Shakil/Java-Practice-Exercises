import java.util.Scanner;

class BalloonTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Balloon balloon = new Balloon();
        double amount = in.nextDouble();
        balloon.inflate(amount);
        System.out.println(balloon.getVolume());
    }
}
