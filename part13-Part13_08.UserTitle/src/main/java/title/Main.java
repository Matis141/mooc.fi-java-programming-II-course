package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a title: ");
        String title = scanner.nextLine();
        String titleParameter = "--userTitle=" + title + "";
        Application.launch(UserTitle.class,
            titleParameter);
    }
}
