
import java.util.ArrayList;
import java.util.HashMap;




public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry; 
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.containsKey(licensePlate)) {
            return false;
        } else {
            this.registry.put(licensePlate, owner);
            return true;
        } 
    }
    
    public String get(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            return this.registry.get(licensePlate);
        } else {
            return null;
        }
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        for (LicensePlate key : this.registry.keySet()) {
            System.out.println(key);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownersList = new ArrayList<String>();
        for (LicensePlate key : this.registry.keySet()) {
            if (!ownersList.contains(this.registry.get(key))) {
                System.out.println(this.registry.get(key));
                ownersList.add(this.registry.get(key));
            }
        }
    }
    
}
