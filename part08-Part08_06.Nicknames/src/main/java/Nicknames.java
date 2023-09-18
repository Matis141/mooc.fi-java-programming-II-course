
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");
        
        for (Map.Entry<String, String> set :
             nicknames.entrySet()) {
 
            // Printing all elements of a Map
            System.out.println(set.getKey() + "'s nickname is "
                               + set.getValue());
        }
        
    }

}
