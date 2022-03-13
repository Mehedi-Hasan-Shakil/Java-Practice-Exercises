public class Data {
    public static double average(Object[] objects, Measurable m) {
        double sum = 0;
        for (Object object : objects) {
            sum += m.measure(object);
        }
        if (objects.length > 0) {
            return sum / objects.length;
        }
        return 0;
    }

    public static Object max(Object[] objects, Measurable m) {
        Object maxObject = objects[0];
        for (Object object : objects) {
            if (m.measure(object) > m.measure(maxObject)) {
                maxObject = object;
            }
        }
        return maxObject;
    }
}
