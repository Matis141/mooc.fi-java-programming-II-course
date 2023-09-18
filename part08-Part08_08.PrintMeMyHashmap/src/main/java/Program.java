
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("abcd", "jkl");
        hm.put("def", "mno");
        hm.put("ghi", "pqr");
        printValuesOfKeysWhere(hm, "a");
    }

    public static void printKeys(HashMap<String,String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if(key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if(key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
    
}
