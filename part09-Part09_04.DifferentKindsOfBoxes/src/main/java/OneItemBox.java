import java.util.ArrayList;

public class OneItemBox extends Box {
    
    private ArrayList<Item> itemList;
    
    public OneItemBox() {
        this.itemList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.itemList.isEmpty()) {
            this.itemList.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.itemList.contains(item);
    }
    
    
}
