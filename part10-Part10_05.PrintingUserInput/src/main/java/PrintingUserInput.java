
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInputList = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                userInputList.add(input);
            }
        }
        
        userInputList.stream()
        .forEach(name -> System.out.println(name));
        
    }
}
