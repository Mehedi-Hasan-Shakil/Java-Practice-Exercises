import java.awt.*;
import java.util.Arrays;
import java.util.Collections;

public class BankAccountTester {
    static class AreaMeasure implements Measurable {

        @Override
        public double measure(Object object) {
            Rectangle rectangle = (Rectangle) object;
            double area = rectangle.getWidth() * rectangle.getHeight();
            return area;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Rectangle[] rectangles = {new Rectangle(1, 1), new Rectangle(2, 2), new Rectangle(3, 3)};
        double average = Data.average(rectangles, new AreaMeasure());
        System.out.println(average);
        Rectangle r = (Rectangle) Data.max(rectangles, new AreaMeasure());
        System.out.println(r.height + " " + r.width);

        BankAccount[] accounts = {new BankAccount(100), new BankAccount(50), new BankAccount(150)};
        average = Data.average(accounts, new BalanceMeasure());
        System.out.println(average);
        BankAccount a = (BankAccount) Data.max(accounts, new BalanceMeasure());
        System.out.println(a.getBalance());


    }
}
