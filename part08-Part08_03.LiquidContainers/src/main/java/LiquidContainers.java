
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First " + first + "/100");
            System.out.println("Second " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                if (first + amount > 100) {
                    first = 100;
                } else if (amount > 0) {
                    first += amount;
                }
            } else if (command.equals("move")) {
                if (amount > first) {
                    amount = first;
                }
                second += amount;
                first -= amount;
                if (second > 100) {
                    int diff = second - 100;
                    second = 100;
                    first += diff;
                }    
            } else if (command.equals("remove")) {
                if (amount > second) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }

        }
    }

}
