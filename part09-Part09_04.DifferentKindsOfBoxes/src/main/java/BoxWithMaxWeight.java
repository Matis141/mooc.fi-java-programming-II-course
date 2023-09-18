import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> itemList;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.capacity) {
            this.itemList.add(item);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Item item : itemList) {
            weight += item.getWeight();
        }
        return weight;
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.itemList.contains(item);
    }
    
    
    
}
