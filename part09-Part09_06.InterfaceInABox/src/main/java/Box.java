
import java.util.ArrayList;


public class Box implements Packable {
    private double maximumCapacity;
    private ArrayList<Packable> itemList;
    
    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.itemList = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() <= maximumCapacity) {
            this.itemList.add(item);
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : itemList) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.itemList.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
