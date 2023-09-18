
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    
    private ArrayList<Person> employees;
    
    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        while (iterator.hasNext()) {
            this.employees.add(iterator.next());
        }
    }
    
    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().ordinal() == education.ordinal()) { 
                System.out.println(nextInLine);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().ordinal() == education.ordinal()) { 
                iterator.remove();
            }
        }
    }
    
}
