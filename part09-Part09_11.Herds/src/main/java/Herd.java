
import java.util.ArrayList;


public class Herd implements Movable {
    
    private ArrayList<Movable> herdList;
    
    public Herd() {
        this.herdList = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String output = "";
        for (Movable herdMember: herdList) {
            output += herdMember.toString();
            output += "\n";
        }
        return output;
    }
    
    public void addToHerd(Movable movable) {
        this.herdList.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable herdMember: herdList) {
            herdMember.move(dx, dy);
        }
    }
    
}
