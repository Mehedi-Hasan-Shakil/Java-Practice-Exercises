import java.util.Scanner;

public class CountryValue {
    private String countryName;
    private double countryArea;

    public CountryValue(String line) {
        Scanner in = new Scanner(line);
        countryName = in.next();
        countryArea = in.nextDouble();
    }

    public String getCountryName() {
        return countryName;
    }

    public double getCountryValue() {
        return countryArea;
    }
}
