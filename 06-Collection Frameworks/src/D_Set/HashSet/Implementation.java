package D_Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Implementation {
    static void main() {
        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("USER");
        roles.add("ADMIN"); // Duplicates get removed

        for (String role : roles){
            System.out.println("ROLE: "+role); // Output is unordered
        }

        // Indexing
        // System.out.println(roles.get(3));  Get method cant be used as set is unordered
    }
}
