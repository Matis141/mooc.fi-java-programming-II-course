

public class MainProgram {

    public static void main(String[] args) {

        Checker checker = new Checker();
        String time = "20:00:00";
        System.out.println(time.substring(2,3));
        if (time.substring(2,3).equals(":")) {
            System.out.println(true);
        }
        System.out.println(checker.timeOfDay(time));
    }
}
