package application;

import java.sql.SQLException;
import java.util.Scanner;

public class Progam {

    public static void main(String[] args) throws SQLException {
        String databasePath = "jdbc:h2:./todo-database";
        if (args.length > 0) {
            databasePath = args[0];
        }

        TodoDao database = new TodoDao(databasePath);
        Scanner s = new Scanner(System.in);
        TodoDao td = new TodoDao("jdbc:h2:./databaseFile");
        td.add(new Todo("Socrates", "is mortal", Boolean.FALSE));
        td.add(new Todo("six", "is a dog", Boolean.FALSE));
        UserInterface ui = new UserInterface(s, td);
        ui.start();
    }
}
