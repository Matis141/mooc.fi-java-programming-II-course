
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        int i = 0;
        while (i < 7) {
            int randomNumber = 1 + random.nextInt(40);
            if (!this.containsNumber(randomNumber)) {
                this.numbers.add(randomNumber);
                i++;
            }
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for (int lotteryNumber : this.numbers()) {
            if (lotteryNumber == number) {
                return true;
            }
        }
        return false;
    }
}

