import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.containsKey(storageUnit)){
            return this.storage.get(storageUnit);
        }
        ArrayList<String> emptyList = new ArrayList<>();
        return emptyList;
    }
    
    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsList = new ArrayList<>();
        for (String key : this.storage.keySet()) {
            if (!this.storage.get(key).isEmpty()) {
                unitsList.add(key);
            }
        }
        return unitsList;
    }
    
}
