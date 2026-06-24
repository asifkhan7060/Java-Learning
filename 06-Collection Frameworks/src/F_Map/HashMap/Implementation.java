package F_Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Implementation {
    static void main() {
        Map<Integer,String> userMap = new HashMap<>();
        userMap.put(1,"Alice");
        userMap.put(5,"Anil");
        // userMap.put(5,"Sam"); Duplicate Keys not Allowed (If added then recent value gets printed (here sam will print if uncomment))

        System.out.println(userMap.get(5));

        for (Map.Entry<Integer,String> entry : userMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
