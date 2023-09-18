
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }
        
        double averagePositive = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(number -> number > 0) 
        .average()
        .getAsDouble();
        
        double averageNegative = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(number -> number < 0)        
        .average()
        .getAsDouble(); 
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String decision = scanner.nextLine();
        if (decision.equals("n")) {
            System.out.println("Average of the negative numbers: " + averageNegative);
        } else if (decision.equals("p")) {
            System.out.println("Average of the positive numbers: " + averagePositive);
        }

    }
}
