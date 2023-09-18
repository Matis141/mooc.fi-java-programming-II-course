
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        String file = "literacy.csv";
        List<CountryLiteracy> literacyList = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                .map(row -> row.split(","))
                .filter(parts -> parts.length >= 6)
                .map(parts -> new CountryLiteracy(parts[2].replace(" (%)",""), parts[3], parts[4], Double.valueOf(parts[5])))
                .forEach(countryLiteracy -> literacyList.add(countryLiteracy));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        literacyList.stream().sorted().forEach(m -> System.out.println(m));
    }
}
