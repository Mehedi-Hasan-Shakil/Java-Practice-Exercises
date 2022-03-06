import java.awt.*;
import java.util.Scanner;

class MeasureTester {
    public static void main(String[] args) {
        Measure measure = new AreaMeasure();
        Rectangle[] rectangles = {new Rectangle(5, 10, 20, 30),
                new Rectangle(10, 20, 30, 40),
                new Rectangle(20, 30, 5, 15)};
        double averageArea = Data.average(rectangles, measure);
        System.out.println(averageArea);
        System.out.println("Expected : " + 625);
    }
}
