
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> userInputList = new ArrayList<>();
        
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String nameInput = scanner.nextLine();
            if (nameInput.equals("0")) {
                break;
            } else {
                System.out.println("Input the age recommendation: ");
                int ageInput = Integer.valueOf(scanner.nextLine());
            }
        }
        
        userInputList.stream()
        .filter(number -> number >= 1 && number <= 5)
        .forEach(name -> System.out.println(name));
        
    }
}
