import java.awt.*;

public class AreaMeasure implements Measure{

    @Override
    public double measure(Object object) {
        Rectangle rectangle = (Rectangle) object;
        double area = rectangle.getHeight() * rectangle.getWidth();
        return area;
    }
}
