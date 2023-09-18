
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String nameInput = scanner.nextLine();
            if (nameInput.equals("")) {
                break;
            } else {
                System.out.println("Input the age recommendation: ");
                int ageInput = Integer.valueOf(scanner.nextLine());
                bookList.add(new Book(nameInput, ageInput));
            }
        }
        
        Comparator<Book> comparator = Comparator
              .comparing(Book::getAgeRecommendation)
              .thenComparing(Book::getName);
        
        Collections.sort(bookList, comparator);
        
        System.out.println(bookList.size() + " books in total.");
        System.out.println("Books:");
        bookList.forEach(book -> System.out.println(book));
    }

}
