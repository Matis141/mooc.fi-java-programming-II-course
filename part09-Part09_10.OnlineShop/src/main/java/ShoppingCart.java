
import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    
    private List<Item> itemList;
    
    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }
    
    public int containsProduct(String product) {
        for (Item item : this.itemList) {
            if (item.getProduct().equals(product)) {
                return this.itemList.indexOf(item);
            }
        }
        return -1;
    }
    
    public void add(String product, int price) {
        if (this.containsProduct(product) != -1) {
            this.itemList.get(this.containsProduct(product)).increaseQuantity();
        } else {
            this.itemList.add(new Item(product, 1, price));
        }
    }
    
    public int price() {
        int price = 0;
        for (Item item : this.itemList) {
            price += item.price();
        }
        return price;
    }
    
    public void print() {
        for (Item item : this.itemList) {
            System.out.println(item);
        }
    }
    
}
