import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PopulationDensityTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("worldpop.txt"));
        Scanner in2 = new Scanner(new File("worldarea.txt"));
        PrintWriter out = new PrintWriter("popdensity.txt");
        while (in1.hasNextLine() && in2.hasNextLine()) {
            CountryValue population = new CountryValue(in1.nextLine());
            CountryValue area = new CountryValue(in2.nextLine());
            double density = population.getCountryValue() / area.getCountryValue();
            out.printf("%10s %12.0f\n", population.getCountryName(), density);
        }
        in1.close();
        in2.close();
        out.close();
    }
}
